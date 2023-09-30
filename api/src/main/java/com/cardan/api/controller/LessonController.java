package com.cardan.api.controller;

import com.cardan.api.model.Lesson;
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
    @PostMapping("/create")
    public Lesson createLesson(@RequestBody Lesson lesson){
        return lesson;
    }
    @GetMapping("path/{id}")
    public Lesson getLessonByPathVariable(@PathVariable int id){
        var lesson =  new Lesson();
        lesson.setId(id);
        lesson.setQty(id*2);
        return lesson;
    }
    @GetMapping("/parameter")
    public Lesson getLessonByParameter(@RequestParam int id){
        var lesson =  new Lesson();
        lesson.setId(id);
        lesson.setQty(id*2);
        return lesson;
    }
}