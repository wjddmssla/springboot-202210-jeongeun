package com.study.springboot202210jeongeun.web.exception;

import lombok.Getter;

import java.util.Map;

public class CustomValidException {
    @Getter
    private Map<String, String> erromMap;

    public CustomValidException(map<string, string> errormap) {
        super("Failed validation!!!");
        this.errormap = errormap;
    }


}
