package com.cardan.api.respository;

import com.cardan.api.model.Lesson;
import org.springframework.stereotype.Repository;

@Repository
public class LessonRepository {
    public Lesson findLessonById(int id) {
        var lesson =  new Lesson();
        lesson.setId(id);
        lesson.setQty(10*id);
        return lesson;
    }
}
