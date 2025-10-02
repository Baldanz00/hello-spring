package it.progettospring.hello_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
 * annotazione che funge da interfaccia, annotando la classe come springboot
 * application, stiamo dicendo che da questo
 * main parte la nostra applicazione
 */
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
