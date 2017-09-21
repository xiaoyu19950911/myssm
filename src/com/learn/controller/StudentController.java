package com.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.learn.pojo.Student;
import com.learn.service.StudentService;

@Controller
@RequestMapping("")
public class StudentController {
	@Autowired
	StudentService studentService;

	@RequestMapping("liststudent")
	public ModelAndView liststudent() {
		List<Student> list = studentService.list();
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.setViewName("liststudent");
		return mav;

	}

}
