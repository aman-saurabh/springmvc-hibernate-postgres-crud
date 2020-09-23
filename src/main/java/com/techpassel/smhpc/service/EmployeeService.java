package com.techpassel.smhpc.service;

import java.util.List;

import com.techpassel.smhpc.model.Employee;

public interface EmployeeService {
	public void addEmployee(Employee e);	 
    public List<Employee> getEmployees();
    public Employee getEmployee(int id);
	public void deleteEmployee(int id);
	public void updateEmployee(Employee emp);
}
