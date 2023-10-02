package com.cardan.api.controller;

import com.cardan.api.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/students")
public class StudentController {
    @PostMapping("/create")
    private Student createStudent (@RequestBody Student student){
        return student;
    }

    @GetMapping("/path/{id}")
    public Student getProductByPathVariable(@PathVariable int id){
        var student = new Student();
        student.setId(id);
        student.setName("name");
        return student;
    }

    @GetMapping("/parameter")
    public Student getStudentByParameter (@RequestParam int id){
        var student = new Student();
        student.setId(id);
        student.setName("name");
        return student;
    }

}
