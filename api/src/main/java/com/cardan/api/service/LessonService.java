package com.cardan.api.service;

import com.cardan.api.model.Lesson;
import com.cardan.api.respository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {
    @Autowired
    LessonRepository lessonRepository;
    public Lesson findById(int id) {
        return lessonRepository.findLessonById(id);
    }
}
