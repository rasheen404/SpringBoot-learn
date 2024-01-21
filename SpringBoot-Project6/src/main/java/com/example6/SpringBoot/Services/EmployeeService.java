package com.example6.SpringBoot.Services;

import java.util.List;

import com.example6.SpringBoot.Entities.Employee;

public interface EmployeeService {

	public String addEmp(Employee e);

	public Employee getEmpInfo(String emp_id);

	public List<Employee> getAllEmpInfo();

	public String updateEmp(Employee e);

	public String deleteEmp(String emp_id);

}
