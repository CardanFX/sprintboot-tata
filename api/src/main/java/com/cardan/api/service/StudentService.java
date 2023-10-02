package com.cardan.api.service;

import com.cardan.api.model.Student;

public class StudentService {
    public Student findById (int id){
        var student = new Student();
        student.setId(id);
        student.setName("name");
        return student;
    }
}
