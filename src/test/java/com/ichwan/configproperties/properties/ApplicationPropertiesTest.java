package com.ichwan.configproperties.properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
public class ApplicationPropertiesTest {

    @Autowired
    private Environment environment;

    @Test
    void testApplicationProperties() {
        String name = environment.getProperty("application.name");
        String id = environment.getProperty("application.id");

        Assertions.assertEquals("P002", id);
        Assertions.assertEquals("Spring Boot Project", name);
    }

    @SpringBootApplication
    public static class TestApplication {

    }
}
