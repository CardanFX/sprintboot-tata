package com.cardan.api.service;
import com.cardan.api.respository.LessonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LessonServiceTest {

    @InjectMocks
    LessonService lessonService;

    @Mock
    LessonRepository lessonRepository;

    @Test
    void testWhenFilter() {

    }
}
