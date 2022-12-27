package com.study.springboot202210jeongeun.web.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ProductDto {
    private String productCode;
    private String productName;
    private String price;
    private String stock;
}
