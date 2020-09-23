package com.techpassel.smhpc.dao;

import java.util.List;

import com.techpassel.smhpc.model.Employee;

public interface EmployeeDAO {
	public void addEmployee(Employee e);
	public List<Employee> getEmployees();
	public Employee getEmployee(int id);
	public void deleteEmployee(int id);
	public void updateEmployee(Employee emp);
}
