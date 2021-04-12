package com.example.concourse;

import com.example.concourse.controller.ConcourseController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ConcourseApplicationTests {

    @Autowired
    private ConcourseController controller;

    @Test
    void contextLoads() {
        assertThat(controller).isNotNull();
    }

}
