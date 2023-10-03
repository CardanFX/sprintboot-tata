package com.cardan.api.controller;

import com.cardan.api.model.TeacherEntity;
import com.cardan.api.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @GetMapping
    public List<TeacherEntity> fetchAll(){
        return teacherService.findAll();
    }
}
