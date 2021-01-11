package kr.green.test.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.test.service.BoardService;
import kr.green.test.vo.BoardVo;
import kr.green.test.vo.UserVo;

@Controller
public class BoardController {
	@Autowired
	BoardService boardService;
	
	@Autowired
	BoardService userService;
	
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public ModelAndView boardlistget(ModelAndView mv, HttpServletRequest request) {
		ArrayList<BoardVo> list = boardService.getBoardList();
		UserVo user = userService.getUser(request);
		System.out.println("/board/list : " + user);
		mv.addObject("list",list);
		mv.setViewName("/board/list");
		return mv;
	}
	@RequestMapping(value = "/board/detail", method = RequestMethod.GET)
	public ModelAndView boardDetailGet(ModelAndView mv, Integer num) {
		System.out.println("화면에서 받은 번호 : " + num);
		BoardVo board = boardService.getBoard(num);
		System.out.println("검색된 게시글 : " + board);
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
	public ModelAndView boardregistePost(ModelAndView mv, BoardVo board) {
		boardService.registerBoard(board);
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
		System.out.println("/board/delete : num = "+num);
		UserVo user = userService.getUser(request);
		System.out.println("/board/delete : num = "+num);
		boardService.deleteBoard(num, user);
		mv.setViewName("redirect:/board/list");
		return mv;
	}
}
