package com.djallil.ems.services;

import com.djallil.ems.model.Employee;
import com.djallil.ems.repository.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;

    @Transactional
    @Override
    public List<Employee> get() {
        return employeeDAO.findAll();
    }

    @Transactional
    @Override
    public Optional<Employee> get(int employeeNumber) {
        return employeeDAO.findById(employeeNumber);
    }

    @Transactional
    @Override
    public void save(Employee employee) {
        employeeDAO.save(employee);
    }

    @Transactional
    @Override
    public void delete(int employeeNumber) {
        employeeDAO.deleteById(employeeNumber);

    }
}
