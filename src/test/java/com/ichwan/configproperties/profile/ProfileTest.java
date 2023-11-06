package com.ichwan.configproperties.profile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@SpringBootTest(classes = ProfileTest.TestApp.class)
public class ProfileTest {

    @Autowired
    private TestApp.SayName sayName;

    @Test
    void testProfile() {
        Assertions.assertEquals("Hai Ichwan from local", sayName.say("Ichwan"));
    }

    @SpringBootApplication
    public static class TestApp {

        public interface SayName {
            String say(String name);
        }

        @Component
        @Profile({"local"})
        public static class toSayName implements SayName {

            @Override
            public String say(String name) {
                return "Hai "+name+" from local";
            }
        }

        @Component
        @Profile({"production"})
        public static class toSayNameProd implements SayName {

            @Override
            public String say(String name) {
                return "Hai "+name+" from prod";
            }
        }
    }
}
