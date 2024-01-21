package com.example3.SpringBoot.EmployeeController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example3.SpringBoot.Employee.Employee;

@RestController
@RequestMapping("emp")
public class EmployeeController {
	
	@GetMapping("{emp_id}")
	public Employee getEmployeeInfo(@PathVariable int emp_id)
	{
		Employee emp = new Employee(emp_id,"ARJUN",25);
		
		return emp;
		
	}

}
