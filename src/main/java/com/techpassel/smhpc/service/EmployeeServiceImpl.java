package com.techpassel.smhpc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techpassel.smhpc.dao.EmployeeDAO;
import com.techpassel.smhpc.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
    private EmployeeDAO empDAO;

    @Override
    @Transactional
    public void addEmployee(Employee emp) {
    	System.out.println("emp : "+ emp);
    	empDAO.addEmployee(emp);
    }

	@Override
	public List<Employee> getEmployees() {
		return empDAO.getEmployees();
	}

	@Override
	public Employee getEmployee(int id) {
		return empDAO.getEmployee(id);
	}

	@Override
	public void deleteEmployee(int id) {
		empDAO.deleteEmployee(id);		
	}

	@Override
	public void updateEmployee(Employee emp) {
		empDAO.updateEmployee(emp);		
	}
}
