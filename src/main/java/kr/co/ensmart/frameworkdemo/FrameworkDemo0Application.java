package kr.co.ensmart.frameworkdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class FrameworkDemo0Application {

	public static void main(String[] args) {
		SpringApplication.run(FrameworkDemo0Application.class, args);
	}

}
