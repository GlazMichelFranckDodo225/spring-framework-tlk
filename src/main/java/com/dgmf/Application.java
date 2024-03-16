package com.dgmf;

import com.dgmf.entity.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		// Creation and Maintenance under
		// the Responsibility of the Developer
		// Alien obj = new Alien();

		Alien obj = context.getBean(Alien.class);
		obj.code();
	}

}
