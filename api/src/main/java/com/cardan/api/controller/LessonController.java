package com.cardan.api.controller;

import com.cardan.api.model.Lesson;
import com.cardan.api.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("lesson")
public class LessonController {
    @Autowired
    LessonService lessonService;

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
    @PostMapping("/create")
    public Lesson createLesson(@RequestBody Lesson lesson){
        return lesson;
    }
    @GetMapping("path/{id}")
    public Lesson getLessonByPathVariable(@PathVariable int id){
        return lessonService.findById(id);
    }
    @GetMapping("/parameter")
    public Lesson getLessonByParameter(@RequestParam int id){
        return lessonService.findById(id);
    }
}