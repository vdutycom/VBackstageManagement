package com.vduty.vbackstage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vduty.vbackstage.user.mapper.UserMapper;

@Controller
@RequestMapping("/")
public class HomeController extends BaseController {
	
	@Autowired
	UserMapper userMapper;
	
	
	/**
	 * 首页
	 * @param request
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping("")
	public String index(HttpServletRequest request, HttpSession session, Model model) {

     
		return "views/index";
	}
	
	
    /**
     * 测试页 
     * @param session
     * @param request
     * @param model
     * @return
     */
	@RequestMapping("/test")
	public String home(HttpSession session, HttpServletRequest request,Model model) {			
		
		
		return "views/index";
	}

	

	/**
	 * 登录页 
	 * @param request
	 * @param res
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse res, HttpSession session, Model model) {	
		
		return "/views/login";
	}

	/**
	 * 登录成功
	 * @return
	 */
	@RequestMapping("/loginsucc")
	public String loginSucc() {

		return "loginSucc";
	}
	

}
