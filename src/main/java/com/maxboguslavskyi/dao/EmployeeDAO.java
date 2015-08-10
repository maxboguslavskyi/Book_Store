package com.maxboguslavskyi.dao;

import com.maxboguslavskyi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    long createEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(long id);

    Employee getEmployee(long id);

    List<Employee> getAllEmployees();

}
