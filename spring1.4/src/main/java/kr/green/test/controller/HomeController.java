package kr.green.test.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.green.test.service.UserService;
import kr.green.test.vo.UserVo;
import kr.green.test.vo.testVo;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET) //로그인 화면=>GET
	public ModelAndView home(ModelAndView mv) {
		//abcd1234의 이메일을 가져옴
		String id = "11";
		String email = userService.getEmail(id);
		UserVo user = userService.getUser(id);
		mv.setViewName("/main/home");
		return mv;
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginGet(ModelAndView mv) {
		mv.setViewName("/main/login");
		return mv;
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginPOST(ModelAndView mv,String username, String password) {
		
		UserVo isUser = userService.isUser(username, password);
		mv.addObject("user", isUser);
		if(isUser != null) {
			mv.setViewName("redirect:/");
		}
		else {
			mv.setViewName("redirect:/login");
		}				
		return mv;
	}
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView signupGet(ModelAndView mv) {
		mv.setViewName("/main/signup");
		return mv;
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public ModelAndView signupPOST(ModelAndView mv, UserVo user) {		
		boolean signup = userService.signup(user);
		if(signup) {
			//loaclhost:8080/test/
			mv.setViewName("redirect:/");
			//loaclhost:8080/test/signup
			//mv.setViewName("/main/home");
		}else {
			mv.setViewName("redirect:/signup");
		}
		return mv;
	}
	@RequestMapping(value = "/signout", method = RequestMethod.GET)
	public ModelAndView signoutGet(ModelAndView mv,HttpServletRequest request) {
		request.getSession().removeAttribute("user");
		mv.setViewName("redirect:/");
		return mv;
	}
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public ModelAndView test1Get(ModelAndView mv) {
		String studentName = "홍길동";
		int studentAge = 18;
		/* 문제1 : 서버에서 보낸 데이터를 이용하여 학생 이름과 나이를 화면에 출력되도록 test1.jsp코드를 수정 */
		mv.addObject("name", studentName);
		mv.addObject("age", studentAge);
		
		/* - 문제 : 서버에서 보낸 testVo 데이터를 이용하여 학생 이름과 나이를 화면에 출려되도록 test1.jsp 코드를 수정 */
		testVo testVo = new testVo("임꺽정",17);
		
		/* - 문제3 : 서버에서 보낸 start와 end를 이용하여 start부터 end사이의 숫자를 출력하는 코드를 test1.jsp에 수정 */
		mv.addObject("testVo",testVo);
		
		mv.addObject("start",1);
		mv.addObject("end",5);
		
		ArrayList<testVo> list = new ArrayList<testVo>();
		list.add(new testVo("김철수",20));
		list.add(new testVo("김영희",19));
		/* -문제 : 서버에서 보낸 학생들 정보가 들어있는 list를 이용하여 학생들의 이름과 나이를 출력하는 test1.jsp를 수정
		 * 		- c:forEach를 이용- */
		mv.addObject("list",list);
		mv.setViewName("/main/test1");
		return mv;
	}
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public ModelAndView test2Get(ModelAndView mv, String name) {
		mv.setViewName("/main/test2");
		return mv;
	}
	@RequestMapping(value = "/test3", method = RequestMethod.GET)
	public ModelAndView test3Get(ModelAndView mv,testVo testVo) {
		mv.setViewName("/main/test2");
		return mv;
	}
	@RequestMapping(value = "/test4", method = RequestMethod.GET)
	public ModelAndView test4Get(ModelAndView mv,String [] name) {
		for(String tmp : name) {
				}
		mv.setViewName("/main/test2");
		return mv;
	}
	@RequestMapping(value = "/test5", method = RequestMethod.GET)
	public ModelAndView test5Get(ModelAndView mv,String name) {
		
		String [] names = name.split(",");
		for(String tmp : names) {
		}
		mv.setViewName("/main/test2");
		return mv;
	}
	@RequestMapping(value = "/dup", method = RequestMethod.POST)
	@ResponseBody
	public String dupGet(String id) {
		UserVo user = userService.getUser(id);
		if(user == null) {
			return "ok";
		}
		return "no";
	}

	@RequestMapping(value = "/find/pw", method = RequestMethod.POST)
	@ResponseBody
	public String findpwPost(String id) {
		UserVo user = userService.getUser(id);
		if(user == null)
			return "fail";
		String pw = "1234";
		user.setPw(pw);
		userService.updateUser(user);
		String title = "비밀번호 변경 메일";
		String content = "새 비밀번호" + pw;
		userService.sendMail(title, content,user.getEmail());
		return "success";
	}
}
