package com.app.jpaexample.service;

import java.util.List;
import java.util.Optional;

import com.app.jpaexample.entity.EmployeeEntity;

public interface EmployeeService {
    List<EmployeeEntity> findAllEmployees();
    Optional<EmployeeEntity> findById(Long id);
    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
    EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
    void deleteEmployee(Long id);

}