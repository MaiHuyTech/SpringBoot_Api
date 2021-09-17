package com.example.springboot_api.Controller;

import com.example.springboot_api.Entity.Student;
import com.example.springboot_api.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author MPHuy on 17/09/2021
 */
@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("/students/{id}")
    public Student getById(@PathVariable long id){
        return studentRepository.findById(id).get();
    }
    @GetMapping("/students")
    public List<Student> getAll(){
        return studentRepository.findAll();
    }
    @PostMapping("/students")
    public ResponseEntity<Student> save(@Valid @RequestBody Student student){
        return new ResponseEntity<Student>(studentRepository.save(student),HttpStatus.CREATED);
    }
    @PutMapping("/students")
    public String update(@Valid @RequestBody Student student){
        studentRepository.save(student);
        return "Put success"+ LocalDateTime.now();
    }
    @DeleteMapping("/students/{id}")
    public String Delete(@PathVariable long id){
        studentRepository.deleteById(id);
        return "Put success"+ LocalDateTime.now();
    }
}
