package com.vgw.demo.gameweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
public class GamewebApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(GamewebApplication.class, args);
	}
}
