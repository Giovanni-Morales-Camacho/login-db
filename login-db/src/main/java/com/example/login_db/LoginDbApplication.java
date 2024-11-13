package com.example.login_db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginDbApplication.class, args);
	}

}
//  http://localhost:8080/
// y esta otra es para conectarme a la instancia de la BBDD: http://localhost:8080/h2-console
// con las credenciales que pusimos en app.properties
// user1 entra con 123