package com.oak;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    List<Student> students = new ArrayList<>();

    List<Student> findAll(){
        return students;
    }

    Student getById(String id){
        for (var s : students){
            if (s.id().equals(id)){
                return s;
            }
        }
        return null;
    }

    @PostConstruct
    private void init(){
        students.add(new Student("A0014652","Fort Wallis", new Grade()));
        students.add(new Student("A0015053","Harry Mort", new Grade()));
        students.add(new Student("A0020654","Lord Farquad", new Grade()));
        students.add(new Student("A0095424","Milly Brown", new Grade()));

        students.get(0).grades().addGrade("A+");
        students.get(0).grades().addGrade("A+");
        students.get(0).grades().addGrade("B+");

        students.get(1).grades().addGrade("B+");
        students.get(1).grades().addGrade("B");
        students.get(1).grades().addGrade("B+");
        students.get(1).grades().addGrade("A+");

        students.get(2).grades().addGrade("A+");
        students.get(2).grades().addGrade("A+");
        students.get(2).grades().addGrade("A+");
        students.get(2).grades().addGrade("C+");

        students.get(3).grades().addGrade("C");
        students.get(3).grades().addGrade("C+");
    }
}
