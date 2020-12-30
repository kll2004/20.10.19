package kr.green.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.spring.vo.Uservo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homeGet(ModelAndView mv, String name) {
		System.out.println("이름(get) : "+ name);
		mv.setViewName("/main/home");
		return mv;
	}
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String homePost(ModelAndView mv, String name, String fruit) {
		System.out.println("이름(post) : " + name);
		System.out.println("과일(post) : " + fruit);
		mv.setViewName("redirect:/");
		return "main/home";
	}
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView testGet(ModelAndView mv) {
		//model.addAllAttributes("변수명",값);
		//값으로 문자열, 정수, 실수, 객체 등 다양한 값들을 보낼 수 있다.
		mv.addObject("name", "홍길동");
		mv.setViewName("/main/test");
		return mv;
	}
	@RequestMapping(value = "signup", method = RequestMethod.GET)
	public ModelAndView signupGet(ModelAndView mv) {
		mv.setViewName("/main/signup");
		return mv;
	}
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public ModelAndView signupPost(ModelAndView mv,Uservo user) {
		System.out.println(user);
		mv.setViewName("redirect:/");
		return mv;
	}
	@RequestMapping(value = "/tiles", method = RequestMethod.GET)
	public ModelAndView tilesGet(ModelAndView mv) {
		mv.setViewName("/main/tiles");
		return mv;
	}
	@RequestMapping(value = "/tiles2", method = RequestMethod.GET)
	public ModelAndView tiles2Get(ModelAndView mv) {
		mv.setViewName("/main/tiles2");
		return mv;
	}
}