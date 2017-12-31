package org.cartboot;

import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class ShoppingApplicationBoot implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplicationBoot.class, args);
	}

	@Transactional
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
	}
}
