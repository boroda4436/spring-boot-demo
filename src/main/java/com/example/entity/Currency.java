package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Bohdan on 30.03.2017
 */
@Entity
public class Currency {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
