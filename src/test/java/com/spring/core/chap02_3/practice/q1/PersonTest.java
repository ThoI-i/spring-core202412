package com.spring.core.chap02_3.practice.q1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class PersonTest {

    @Test
    void test() {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(ModelConfig.class);

        Person person = context.getBean(Person.class);

    }
}