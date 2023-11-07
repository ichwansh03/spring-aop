package com.ichwan.configproperties.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("application")
public class ApplicationProperties {

    private String id;

    private String name;

    private Integer version;

    private DatabaseProperties database;
    @Getter
    @Setter
    public static class DatabaseProperties {
        private String username;
        private String password;
        private String url;
        private String dbname;
    }
}
