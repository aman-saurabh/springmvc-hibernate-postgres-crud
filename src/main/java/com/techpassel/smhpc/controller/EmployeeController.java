package com.techpassel.smhpc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.techpassel.smhpc.model.Employee;
import com.techpassel.smhpc.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/add-employee")
	public ModelAndView test() {
		ModelAndView mView = new ModelAndView();
		mView.setViewName("add-employee");
		Employee emp = new Employee();
		mView.addObject("employee", emp);
		return mView;
	}
	
	@RequestMapping("/save-employee")
	public ModelAndView addEmployee(@ModelAttribute Employee employee) {
		employee.setActive(true);		
		try {
			employeeService.addEmployee(employee);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return new ModelAndView("redirect:/employees");
	}
	
	@RequestMapping("employees")
	public ModelAndView listEmployees() {
		List<Employee> e = employeeService.getEmployees();
		ModelAndView mView = new ModelAndView();
		mView.setViewName("employee-list");
		mView.addObject("employees", e);
		return mView;
	}
	
	@RequestMapping("/edit-employee")
	public ModelAndView editEmployee(HttpServletRequest request) {
		int empId = Integer.parseInt(request.getParameter("id"));
		Employee emp = employeeService.getEmployee(empId);
		ModelAndView mView = new ModelAndView();
		mView.setViewName("add-employee");
		mView.addObject("employee", emp);
		return mView;
	}
	
	@RequestMapping("/delete-employee")
	public ModelAndView deleteEmployee(HttpServletRequest request) {
		int empId = Integer.parseInt(request.getParameter("id"));
		employeeService.deleteEmployee(empId);
		return new ModelAndView("redirect:/employees");
	}
}
