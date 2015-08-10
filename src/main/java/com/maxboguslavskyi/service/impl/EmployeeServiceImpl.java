package com.maxboguslavskyi.service.impl;

import com.maxboguslavskyi.dao.EmployeeDAO;
import com.maxboguslavskyi.entity.Employee;
import com.maxboguslavskyi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public long createEmployee(Employee employee) {
        return employeeDAO.createEmployee(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeDAO.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(long id) {
        employeeDAO.deleteEmployee(id);
    }

    @Override
    public Employee getEmployee(long id) {
        return employeeDAO.getEmployee(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
