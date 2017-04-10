package com.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by b.chupika on 28.03.2017
 */
@Entity
@Data
public class CostCategory {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
