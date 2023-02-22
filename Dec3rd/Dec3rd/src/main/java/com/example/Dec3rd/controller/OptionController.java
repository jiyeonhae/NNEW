package com.example.Dec3rd.controller;

import com.example.Dec3rd.dto.CategoryDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/option")
public class OptionController {

    @PostMapping("/category")
    public ResponseEntity<?> addCategory(CategoryDto categoryDto){
        System.out.println(categoryDto);
        return ResponseEntity.created(null).body(null);
    }

    @GetMapping("/categories")
    public ResponseEntity<?> getCategory(){

    }
}


//만드는 순서 DB - controller - dto - repository

//호출순서 controller - service - repository