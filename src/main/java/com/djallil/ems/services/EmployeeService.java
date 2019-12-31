package com.djallil.ems.services;


import com.djallil.ems.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> get();

    Optional<Employee> get(int employeeNumber);

    void save(Employee employee);

    void delete(int employeeNumber);
}
