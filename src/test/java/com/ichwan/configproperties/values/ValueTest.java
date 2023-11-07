package com.ichwan.configproperties.values;


import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Slf4j
@SpringBootTest(classes = ValueTest.TestApplication.class)
public class ValueTest {

    @Autowired
    private TestApplication.ApplicationProperties properties;

    @Autowired
    private TestApplication.UserProperties userProperties;

    @Test
    void testValue() {
        Assertions.assertEquals(1, properties.getVersion());
        Assertions.assertEquals("CodeAcademy", userProperties.getName());
        log.info("access to user.properties.name {}",userProperties.getName());
        Assertions.assertEquals("ichwansh03@gmail.com", userProperties.getEmail());
        log.info("access to user.properties.email {}",userProperties.getEmail());
    }

    @SpringBootApplication
    @PropertySources({@PropertySource("classpath:/user.properties")})
    public static class TestApplication {

        @Component
        @Getter
        public static class ApplicationProperties {

            @Value("${application.id}")
            private String id;

            @Value("${application.name}")
            private String name;

            @Value("${application.version}")
            private Integer version;
        }

        @Component
        @Getter
        public static class UserProperties {

            @Value("${user.id}")
            private String id;

            @Value("${user.name}")
            private String name;

            @Value("${user.email}")
            private String email;
        }
    }
}
