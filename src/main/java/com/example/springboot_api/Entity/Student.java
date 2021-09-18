package com.example.springboot_api.Entity;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue
    private long id;
    @NotBlank(message = "Please add name Student!")
    @Length(max = 20, min= 1, message = "less than 10 and greater than 1")
    @Column(name = "name_student")
    private String nameStudent;
    @NotBlank(message = "Please add class Student!")
    @Length(max =  10,min= 1, message = "less than 20 and greater than 1")
    @Column(name = "class_student")
    private String classStudent;
    @Email
    @Column(name = "email_student")
    private String emailStudent;
}
