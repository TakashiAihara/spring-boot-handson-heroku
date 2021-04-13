package com.handson.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class DemoApplication {

  @RequestMapping("/")
  public String home() {
    return "Hello Docker World";
  }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
