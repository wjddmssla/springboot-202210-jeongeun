package com.study.springboot202210jeongeun.service;

import com.study.springboot202210jeongeun.repository.EmployeeRepository;
import com.study.springboot202210jeongeun.web.dto.EmpDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public int addEmployee(EmpDto employeeDto) {
        return employeeRepository.saveEmployee(employeeDto) > 0 ? employeeDto.getEmpId() : 0;
    }

}