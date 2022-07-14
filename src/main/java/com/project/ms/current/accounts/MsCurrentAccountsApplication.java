package com.project.ms.current.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing;

@SpringBootApplication
@EnableReactiveMongoAuditing
public class MsCurrentAccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCurrentAccountsApplication.class, args);
	}

}
