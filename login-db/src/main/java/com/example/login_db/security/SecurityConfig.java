package com.example.login_db.security;
 
import com.example.login_db.service.UserDetailsServiceImpl; //importando el servicio que creé
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider; //común en implementación básica en Spring Security
import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.util.matcher.AnyRequestMatcher;
 
 
@Configuration
public class SecurityConfig {
 
    private final UserDetailsServiceImpl UserDetailsService;
    //contructor para inicializar servicio para obtener detalles de usaurios
    public SecurityConfig(UserDetailsServiceImpl UserDetailsService){
        this.UserDetailsService = UserDetailsService;
    }
 // creación de método para filtrar seguridad
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/login", "/h2-console/**").permitAll()// para esas no requiere autenticación
                .anyRequest().authenticated()  //todo lo demás sí requiere autenticación
            )
            .formLogin(form -> form
                .loginPage("/login") //así se indica que el form de autentic va a desplegarse en /login
                .defaultSuccessUrl("/") //si la autentic fue exitosa va a esa ruta.
                .permitAll()
            )
            .logout(logout -> logout
                .permitAll()
            )
            .csrf(csrf -> csrf.disable())
            .headers(headers -> headers.frameOptions().disable());
        return http.build();
    }
    //sigue otro público para obtener datos del usuario. Función: autenticar usuarios utilizando UserDetailsService y PasswordEncoder
    @Bean
    public DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider(); //crea una instancia del DaoAuthenticationProvider
        authProvider.setUserDetailsService(UserDetailsService); //para obtener detalles del usr basado en el nombre del usr
        authProvider.setPasswordEncoder(passwordEncoder());  //para validar la contraseña proporcionada/desencriptar la contraseña
        return authProvider;
    } //si la autenticación es exitosa devuelve un objeto con los detalles del usuario autenticado. (? se usa acá)
 //un bean más para desencriptar la contraseña
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
}