package com.example.demo2;

import org.springframework.boot.SpringApplication;

public class TestDemo2Application {

	public static void main(String[] args) {
		SpringApplication.from(Demo2Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
