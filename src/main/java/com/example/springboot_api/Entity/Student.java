package com.example.springboot_api.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String nameStudent;
    private String classStudent;
}
