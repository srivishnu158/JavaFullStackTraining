package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void addSutdent(String name){
        Student student = Student.builder()
                .studentName(name)
                .build();

        studentRepository.save(student);
       System.out.println( studentRepository.findByStudentId(2));
    }
}
