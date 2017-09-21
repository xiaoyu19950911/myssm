package com.learn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.mapper.StudentMapper;
import com.learn.pojo.Student;
import com.learn.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired

	StudentMapper studentmapper;

	@Override
	public List<Student> list() {
		// TODO Auto-generated method stub
		return studentmapper.liststudent();
	}

}
