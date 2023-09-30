package com.cardan.api.service;

import com.cardan.api.model.Lesson;
import org.springframework.stereotype.Service;

@Service
public class LessonService {
    public Lesson findById(int id) {
        var lesson =  new Lesson();
        lesson.setId(id);
        lesson.setQty(10*id);
        return null;
    }
}
