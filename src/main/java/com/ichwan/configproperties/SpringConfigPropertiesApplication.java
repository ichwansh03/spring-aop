package com.ichwan.configproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class SpringConfigPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigPropertiesApplication.class, args);
	}

}
