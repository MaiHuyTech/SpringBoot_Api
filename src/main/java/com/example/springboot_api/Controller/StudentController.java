package com.example.springboot_api.Controller;

import com.example.springboot_api.Entity.Student;
import com.example.springboot_api.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

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
    public String save(@Valid @RequestBody Student student){
         studentRepository.save(student);
        return "save success"+ LocalDateTime.now();
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
