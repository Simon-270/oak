package com.oak;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository repository){
        this.studentRepository = repository;
    }

    @GetMapping("/")
    List<Student> getStudents(){
        return studentRepository.findAll();
    }
    @GetMapping("/{id}")
    Student getStudent(@PathVariable String id){
        return studentRepository.getById(id);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    void create(@RequestBody Student student){
        studentRepository.addStudent(student);
    }
}
