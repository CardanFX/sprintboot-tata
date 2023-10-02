package com.cardan.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/students")
public class StudentController {
    @PostMapping
    private String create(){
        return "post";
    }

    @GetMapping
    public String read(){
        return"get";
    }

    @PutMapping
    public String update(){
        return "put";
    }
    @DeleteMapping
    public String delete(){
        return "delete";
    }
}
