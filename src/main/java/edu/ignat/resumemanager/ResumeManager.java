package edu.ignat.resumemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class ResumeManager {

	public static void main(String[] args) {
		SpringApplication.run(ResumeManager.class, args);
	}

}
