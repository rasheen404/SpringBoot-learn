package com.example6.SpringBoot.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example6.SpringBoot.Entities.Employee;
import com.example6.SpringBoot.Services.EmployeeService;

@RestController
@RequestMapping("employee")
public class Controller {

	EmployeeService employeeService;

	public Controller(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@PostMapping
	public String addEmp(@RequestBody Employee e) {
		String msg = employeeService.addEmp(e);

		return msg;
	}
	
	@GetMapping(value = "{emp_id}")
	public Employee getEmpInfo(@PathVariable String emp_id) {
		Employee e = employeeService.getEmpInfo(emp_id);
		return e;
	}
	
	@GetMapping
	public List<Employee> getAllEmpInfo() {
		List<Employee> emplistobject = employeeService.getAllEmpInfo();
		return emplistobject;
	}
	
	@PutMapping
	public String updateEmp(@RequestBody Employee e) {
		
		String msg = employeeService.updateEmp(e);
		return msg;
	
	}

	@DeleteMapping(value = "{emp_id}")
	public String deleteEmp(@PathVariable String emp_id) {
		String msg = employeeService.deleteEmp(emp_id);
		return msg;
	}
}