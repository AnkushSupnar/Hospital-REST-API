package com.hospital.data.service;

import com.hospital.data.dao.EmployeeRepository;
import com.hospital.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;
    public String getEmployee(){
      return repository.getEmplyee();
    }
}
