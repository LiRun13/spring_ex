package com.runni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runni.dao.StudentMapper;
import com.runni.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	public StudentMapper studentMapper;

	public void save(Student student) {
		studentMapper.insert(student);
	}

}
