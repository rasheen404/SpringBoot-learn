package com.example2.SpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example2.SpringBoot.Entities.Student;

@RestController
@RequestMapping("stud")
public class StudentController {

	@GetMapping("{kodid}")
	public Student getStudentInfo(@PathVariable String kodid) {
		
		Student st = new Student(kodid,"Amit",23);
		
		return st;
	}


}
