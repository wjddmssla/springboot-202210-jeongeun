package com.study.springboot202210jeongeun.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class RequestStudyDto {
    private String name;
    private String email;
    private String address;
}
