package com.example.Dec3rd.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder //요건 뭘까
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryDto {
    private int categoryId;
    private String categoryName;
}
