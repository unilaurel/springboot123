package com.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SSMPApplication {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(args));
		ConfigurableApplicationContext run = SpringApplication.run(SSMPApplication.class, args);
		for (String name : run.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
