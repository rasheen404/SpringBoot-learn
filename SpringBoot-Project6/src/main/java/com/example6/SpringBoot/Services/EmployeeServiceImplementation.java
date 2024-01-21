package com.example6.SpringBoot.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example6.SpringBoot.Entities.Employee;
import com.example6.SpringBoot.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	EmployeeRepository employeeRepository;

	public EmployeeServiceImplementation(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public String addEmp(Employee e) {
		employeeRepository.save(e);
		return "Employee Object is created and saved.";
	}

	@Override
	public Employee getEmpInfo(String emp_id) {
		Employee e = employeeRepository.findById(emp_id).get();
		return e;
	}

	@Override
	public List<Employee> getAllEmpInfo() {
		List<Employee> e = employeeRepository.findAll();
		return e;
	}

	@Override
	public String updateEmp(Employee e) {
		employeeRepository.save(e);
		return "Employee object is Updated.";
	}

	@Override
	public String deleteEmp(String emp_id) {
		employeeRepository.deleteById(emp_id);
		return "Employee object is deleted.";
	}

}
