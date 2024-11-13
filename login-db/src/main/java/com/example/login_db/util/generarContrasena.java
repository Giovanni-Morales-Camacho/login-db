package com.example.login_db.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 
public class generarContrasena {
 
	public static void main(String[] args) {
    	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        
    	String hashedPassword = passwordEncoder.encode("123"); //Acá escojo la palabra que quiero usar como contraseña
    	System.out.println("Contrasena encriptada: " + hashedPassword);
	}/* al ejecutarse esto en la consola saldrá el extenso string de la encriptación de una contraseña 
    la cual saldrá por Consola, y de ahí la debo tomar para incluirla junto con el usuario en la bbdd
    mediante la ejecución del comando Sql que está en el archivo data.sql*/

}

