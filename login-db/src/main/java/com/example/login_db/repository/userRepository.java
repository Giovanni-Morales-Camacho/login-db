package com.example.login_db.repository;  //acá 1° tengo el nombre de mi paquete
 
import java.util.Optional; //para prevenir que se nos caiga en caso de la tabla tenga "null" registros

import org.springframework.data.jpa.repository.JpaRepository;  //para que la clase que he declarado aquí se comporte como un repositorio

import com.example.login_db.model.User;   //acá es donde he importado el modelo y ya podría instanciarl
// así se debe crear la clase repository y sí debe llamarse igual que el nombre del archivo userRepository.java
public interface userRepository extends JpaRepository<User, Long> { //ponemos Long xq no sabemos el tamaño del objeto que va a recuperar
    Optional<User> findByUsername(String username);//esto hace q vaya a model/User y me devuelva el valor de "username"
}  //Este repository user es para que se comunique con el model. user.java