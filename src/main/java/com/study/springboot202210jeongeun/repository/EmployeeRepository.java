package com.study.springboot202210jeongeun.repository;

import com.study.springboot202210jeongeun.web.dto.EmpDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeRepository {
    public int saveEmployee(EmpDto empDto);
}

