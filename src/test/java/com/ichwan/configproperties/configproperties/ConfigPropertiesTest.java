package com.ichwan.configproperties.configproperties;

import com.ichwan.configproperties.properties.ApplicationProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ConfigPropertiesTest.TestApplication.class)
public class ConfigPropertiesTest {

    @Autowired
    private ApplicationProperties properties;

    @Test
    void testConfigProperties() {
        Assertions.assertEquals("Spring Boot Project", properties.getName());
        Assertions.assertEquals(1, properties.getVersion());

        Assertions.assertEquals("shopdb", properties.getDatabase().getDbname());
        Assertions.assertEquals("jdbc:example",properties.getDatabase().getUrl());
    }

    @SpringBootApplication
    @EnableConfigurationProperties({ApplicationProperties.class})
    public static class TestApplication {

    }
}
