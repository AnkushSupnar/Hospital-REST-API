package com.hospital.controller;

import com.hospital.data.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService service;
    @GetMapping("/allemplyee")
    public String getEmployee(){
    return service.getEmployee();

    }



}
