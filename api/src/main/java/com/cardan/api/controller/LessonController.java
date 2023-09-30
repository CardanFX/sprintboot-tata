package com.cardan.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("lesson")
public class LessonController {
    @PostMapping
    public String create() {
        return "post";
    }
    @GetMapping
    public String read(){
        return "get";
    }
    @PutMapping
    public String update(){
        return "put";
    }
    @DeleteMapping
    public String delete(){
        return "del";
    }
}
