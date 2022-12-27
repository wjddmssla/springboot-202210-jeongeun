package com.study.springboot202210jeongeun.service;

import com.study.springboot202210jeongeun.repository.OptionRepository;
import com.study.springboot202210jeongeun.web.dto.CategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionService {

    @Autowired
    private OptionRepository optionRepository;

    public int addCategory(CategoryDto categoryDto) {
        return optionRepository.saveCategory(categoryDto) > 0 ? categoryDto.getCategoryId() : 0;
    }

    public List<CategoryDto> getCategories() {

        return optionRepository.getCategories();
    }
    public void modifyCategory(int categoryId, CategoryDto categoryDto) {
        categoryDto.setCategoryId(categoryId);
        optionRepository.modifyCategory(categoryDto);
    }

}