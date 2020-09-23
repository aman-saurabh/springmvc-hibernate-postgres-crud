package com.techpassel.smhpc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techpassel.smhpc.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public void addEmployee(Employee e) {
		sessionFactory.getCurrentSession().saveOrUpdate(e);		
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> result = sessionFactory.getCurrentSession().createQuery("from Employee", Employee.class).getResultList();
		//return sessionFactory.getCurrentSession().createQuery("from employee").list();
		return result;
	}

	@Override
	public Employee getEmployee(int id) {		
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
	}
	
	@Override
    public void updateEmployee(Employee emp) {
        sessionFactory.getCurrentSession().update(emp);
    }

	@Override
	public void deleteEmployee(int id) {
		Employee emp = (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
		if(emp != null)
			sessionFactory.getCurrentSession().delete(emp);
	}	
}
