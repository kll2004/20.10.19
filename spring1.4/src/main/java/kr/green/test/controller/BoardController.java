package kr.green.test.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import kr.green.test.pagination.Criteria;
import kr.green.test.pagination.PageMaker;
import kr.green.test.service.BoardService;
import kr.green.test.utills.UploadFileUtils;
import kr.green.test.vo.BoardVo;
import kr.green.test.vo.FileVo;
import kr.green.test.vo.UserVo;

@Controller
public class BoardController {
	@Autowired
	BoardService boardService;
	
	@Autowired
	BoardService userService;
	
	private String uploadPath = "D:\\JAVA_KBJ\\upload";
	
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public ModelAndView boardlistget(ModelAndView mv, HttpServletRequest request, Criteria cri) {						
		//(수정)전체 게시글을 가져오는 서비스의 getBoardList()를 현재 페이지글을 가져오는 getBoardList(cri)로 수정
		//현재 페이지정보를 화면에서 전달받아옴(매개변수) : Criteria cri		
		ArrayList<BoardVo> list = boardService.getBoardList(cri);
		//서비스에게 전체 게시글 갯수를 알려달라고 요청하여 변수에 저장
		int totalcount = boardService.getTotalCount(cri);
		//한 페이지네이션에서 보여줄 최대 페이지 수를 임의로 변수에 저장
		int displayPageNum = 2;
		//현재페이지 정보, displayPageNum, 전체 게시글 수를 이용하여 새로운 PageMaker객체를 생성
		PageMaker pm = new PageMaker(totalcount, displayPageNum, cri);
		mv.addObject("pm",pm);
		mv.addObject("list",list);
		mv.setViewName("/board/list");
		return mv;
	}
	@RequestMapping(value = "/board/detail", method = RequestMethod.GET)
	public ModelAndView boardDetailGet(ModelAndView mv, Integer num, Criteria cri) {
		
		boardService.views(num);
		
		BoardVo board = boardService.getBoard(num);
		
		ArrayList<FileVo> fileList = boardService.getFileList(num);
		
		mv.addObject("fLile",fileList);
		mv.addObject("cri",cri);
		mv.addObject("board",board);
		mv.setViewName("/board/detail");
		return mv;
	}
	
	
	@RequestMapping(value = "/board/register", method = RequestMethod.GET)
	public ModelAndView boardregisteget(ModelAndView mv) {
		mv.setViewName("/board/register");
		return mv;
	}
	
	
	@RequestMapping(value = "/board/register", method = RequestMethod.POST)
	public ModelAndView boardregistePost(ModelAndView mv, BoardVo board, MultipartFile[] fileList) throws IOException, Exception {
		boardService.registerBoard(board);
		//화면에거 넘어온 파일이 있고, 파일명이 0글자가 아닐때
		if(fileList != null && fileList.length != 0) {
			//첨부파일배열에 첨부파일이 있으면
			for(MultipartFile file : fileList) {
				if(file != null && file.getOriginalFilename().length() != 0) {
					String path = UploadFileUtils.uploadFile(uploadPath, file.getOriginalFilename(),file.getBytes());
					//첨부파일이 있으면 업로드를 하고, 업로드된 파일명을 문자열 객체 저장(UploadfileUtils클래스의 메소드를 호출)
					boardService.registerFile(board.getNum(), file.getOriginalFilename(), path);
				}
			}
		}
		mv.setViewName("redirect:/board/register");
		return mv;
	}
	@RequestMapping(value = "/board/modify", method = RequestMethod.GET)
	public ModelAndView boardmodifyPost(ModelAndView mv, Integer num) {
		BoardVo board = boardService.getBoard(num);
		mv.addObject("board",board);
		mv.setViewName("/board/modify");
		return mv;
	}
	@RequestMapping(value = "/board/modify", method = RequestMethod.POST)
	public ModelAndView boardmodifyPost(ModelAndView mv, BoardVo board, HttpServletRequest request) {
		UserVo user = userService.getUser(request);
		boardService.modifyBoard(board, user);
		mv.setViewName("redirect:/board/list");
		return mv;
	}
	@RequestMapping(value = "/board/delete", method = RequestMethod.GET)
	public ModelAndView boarddeleteget(ModelAndView mv,  Integer num, HttpServletRequest request) {
		UserVo user = userService.getUser(request);
		boardService.deleteBoard(num, user);
		mv.setViewName("redirect:/board/list");
		return mv;
	}
	@ResponseBody
	@RequestMapping(value="/board/download")
	public ResponseEntity<byte[]> downloadFile(String fileName)throws Exception{
	    InputStream in = null;
	    ResponseEntity<byte[]> entity = null;
	    try{
	        String FormatName = fileName.substring(fileName.lastIndexOf(".")+1);
	        HttpHeaders headers = new HttpHeaders();
	        in = new FileInputStream(uploadPath+fileName);

	        fileName = fileName.substring(fileName.indexOf("_")+1);
	        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
	        headers.add("Content-Disposition",  "attachment; filename=\"" 
				+ new String(fileName.getBytes("UTF-8"), "ISO-8859-1")+"\"");
	        entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in),headers,HttpStatus.CREATED);
	    }catch(Exception e) {
	        e.printStackTrace();
	        entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
	    }finally {
	        in.close();
	    }
	    return entity;
	}
}
