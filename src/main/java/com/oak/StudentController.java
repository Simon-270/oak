package com.oak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository repository){
        this.studentRepository = repository;
    }

    @GetMapping("/")
    String home(){
        return "HOme";
    }
    @GetMapping("/api/students")
    List<Student> getStudents(){
        return studentRepository.findAll();
    }

}
