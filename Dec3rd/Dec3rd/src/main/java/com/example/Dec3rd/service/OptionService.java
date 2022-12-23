package com.example.Dec3rd.service;

import com.example.Dec3rd.dto.CategoryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service @Transactional(readOnly = true)
public class OptionService {

    @Transactional
    public int addCategory(CategoryDto categoryDto){
        return ;
    }
}
