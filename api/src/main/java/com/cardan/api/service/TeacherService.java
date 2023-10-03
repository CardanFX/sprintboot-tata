package com.cardan.api.service;

import com.cardan.api.model.TeacherEntity;
import com.cardan.api.respository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacherRepository;
    public List<TeacherEntity> findAll() {
        return teacherRepository.findAll();
    }
}
