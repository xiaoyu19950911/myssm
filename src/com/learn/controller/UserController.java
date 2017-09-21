package com.learn.controller;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.learn.pojo.User;
import com.learn.service.UserService;

@Controller
@Scope(value = "prototype")
@RequestMapping("/user")
public class UserController {
	@Resource
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(User user, Model model) {
		user = userService.checkLogin(user.getUsername(), user.getPassword());
		if (user != null) {
			model.addAttribute(user);
			return "redirect:/liststudent";// 路径 WEB-INF/jsp/
		}
		return "fail";

	}

	@RequestMapping("/signup")
	public ModelAndView signup(User user) {
		userService.add(user);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("secces");
		return mav;

	}
}
