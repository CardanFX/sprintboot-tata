package com.cardan.api.respository;

import com.cardan.api.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    public Student findStudentById (int id){
        var student = new Student();
        student.setId(id);
        student.setName("name");
        return student;
    }

}
