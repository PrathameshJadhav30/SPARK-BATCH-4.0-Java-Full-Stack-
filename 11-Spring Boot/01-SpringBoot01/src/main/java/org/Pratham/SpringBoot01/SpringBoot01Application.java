package org.Pratham.SpringBoot01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot01Application implements CommandLineRunner {

	@Autowired
	private Notification notification;

	SpringBoot01Application(){

	}

	public SpringBoot01Application(Notification notification) {
		this.notification = notification;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot01Application.class, args);
	}


	public void run(String... args){
		notification.notifyUser();
	}
}
