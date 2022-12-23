package com.example.Dec3rd.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Category {

    @Id @GeneratedValue
    private Long id;


    private String upCloth;

    private String downCloth;

    private String shoes;

}
