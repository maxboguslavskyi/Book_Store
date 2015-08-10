package com.maxboguslavskyi.dao.impl;

import com.maxboguslavskyi.dao.EmployeeDAO;
import com.maxboguslavskyi.entity.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public long createEmployee(Employee employee) {
        Serializable id = sessionFactory.getCurrentSession().save(employee);
        return (Long) id;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        sessionFactory.getCurrentSession().update(employee);
        return employee;
    }

    @Override
    public void deleteEmployee(long id) {
        Employee employee = new Employee();
        employee.setId(id);
        sessionFactory.getCurrentSession().delete(employee);
    }

    @Override
    public Employee getEmployee(long id) {
        return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
    }
}
