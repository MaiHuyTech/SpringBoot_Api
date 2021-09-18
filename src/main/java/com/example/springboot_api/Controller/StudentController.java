package com.example.springboot_api.Controller;

import com.example.springboot_api.DTO.StudentDTO;
import com.example.springboot_api.Entity.Student;
import com.example.springboot_api.Error.RestResponseEntityExceptionHandler;
import com.example.springboot_api.Error.StudentNotFoundException;
import com.example.springboot_api.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students/DTO")
    public List<StudentDTO> getDTOById() {
        List<Student> students = studentRepository.findAll();
        List<StudentDTO> studentDTOS = new ArrayList<>();
        for(Student student: students){
            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setNameStudent(student.getNameStudent());
            studentDTO.setId(student.getId());
              studentDTOS.add(studentDTO);
        }
        return studentDTOS;
    }

    @GetMapping("/students/{id}")
    public Student getById(@PathVariable long id) throws StudentNotFoundException {

             Optional<Student> student = studentRepository.findById(id);
             if(!student.isPresent()){
                 throw new StudentNotFoundException("Student not found");
             }
             return student.get();
    }
//        @GetMapping("/students/{id}")
//    public Student getById(@PathVariable long id) throws StudentNotFoundException {
//
//            return studentRepository.findById(id).get();
//
//    }

    @GetMapping("/students")
    public List<Student> getAll() {
        return studentRepository.findAll();
    }
    @PostMapping("/students")
    public String save(@Valid @RequestBody Student student) {
        studentRepository.save(student);
        return "save success" + LocalDateTime.now();
    }
    @PutMapping("/students")
    public String update(@Valid @RequestBody Student student) {
        studentRepository.save(student);
        return "Put success" + LocalDateTime.now();
    }
    @DeleteMapping("/students/{id}")
    public String Delete(@PathVariable long id) {
        studentRepository.deleteById(id);
        return "Put success" + LocalDateTime.now();
    }

}
