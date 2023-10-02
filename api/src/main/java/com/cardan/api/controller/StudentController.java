package com.cardan.api.controller;

import com.cardan.api.model.Student;
import com.cardan.api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/students")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/create")
    private Student createStudent (@RequestBody Student student){
        return student;
    }

    @GetMapping("/path/{id}")
    public Student getByPathVariable(@PathVariable int id){
        return studentService.findById(id);
    }

    @GetMapping("/parameter")
    public Student getStudentByParameter (@RequestParam int id){
        return studentService.findById(id);
    }

}
