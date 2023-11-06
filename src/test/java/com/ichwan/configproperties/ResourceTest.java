package com.ichwan.configproperties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

public class ResourceTest {

    @Test
    void resourceTest() {

        ClassPathResource resource = new ClassPathResource("/sample/todo.txt");

        Assertions.assertNotNull(resource);
        Assertions.assertTrue(resource.exists());
    }
}
