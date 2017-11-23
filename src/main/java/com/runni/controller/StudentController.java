package com.runni.controller;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.runni.entity.Student;
import com.runni.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	public StudentService studentService;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping(value="save",method=RequestMethod.POST)
	@ResponseBody
	public String save(String sName,String sAge) {
		log.debug("debug===enter save");
		log.info("info===enter save");
		Student s = new Student();
		s.setsName(sName);
		s.setsAge(Integer.valueOf(sAge));
		studentService.save(s);
		return "保存成功";
		
	}

}
