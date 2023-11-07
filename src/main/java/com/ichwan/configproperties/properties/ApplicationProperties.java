package com.ichwan.configproperties.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

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
        private List<String> tables;
        private Map<String, Integer> maxTablesSize;
    }
}
