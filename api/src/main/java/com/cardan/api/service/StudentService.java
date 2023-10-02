package com.cardan.api.service;

import com.cardan.api.model.Student;
import com.cardan.api.respository.ProductRepository;
import com.cardan.api.respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student findById (int id){
        return studentRepository.findById((long)id).get();
    }

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }
}
