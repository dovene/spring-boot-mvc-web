package com.dev.mvcweb;

import com.dev.mvcweb.repository.CustomProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcWebApplication implements CommandLineRunner {

	@Autowired
	private CustomProperties properties;

	public static void main(String[] args) {
		SpringApplication.run(MvcWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(properties.getApiUrl());
	}


}
