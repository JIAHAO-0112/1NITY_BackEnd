package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableJpaRepositories
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello world, im jiahao");
	}
//
//	@RestController
//	public class HelloWorldController {
//
//		@GetMapping("/hello")
//		public String helloWorld() {
//			return "Hello, World!";
//		}
//
//		@RestController
//		@RequestMapping("/api/items")
//		public class ItemController {
//			@GetMapping
//			public List<String> getItems() {
//				// Replace this with your actual data retrieval logic
//				List<String> items = Arrays.asList("Item 1", "Item 2", "Item 3");
//				return items;
//			}
//		}
//	}
}
