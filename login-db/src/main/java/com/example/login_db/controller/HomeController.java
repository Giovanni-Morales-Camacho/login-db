package com.example.login_db.controller;
 
import java.security.Principal;

import org.springframework.stereotype.Controller; //biblioteca para hacer q esto se vuelva un controlador
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;  // permita usar get
 
 //el interés de un controller es simplemente hablar con el frontend, no tanto con la lógica, para la lógica está el service
@Controller    //las anotaciones cambian el comportamiento de las clases
public class HomeController {
    
    @GetMapping("/")
    public String home(Model model, Principal principal){  //no tenía parámetros, yo los puse para usar el id en el saludo home.html
        model.addAttribute("username", principal.getName()); //obtener el nombre del usuario con el fin de usarlo en home.html
        return "home";  //será la pág. de inicio por defecto
    }
 
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    //luego de esto hay que crear tanto ese home como el login en la carpeta templates    
}
 