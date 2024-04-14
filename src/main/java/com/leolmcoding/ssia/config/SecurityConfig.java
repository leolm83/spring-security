package com.leolmcoding.ssia.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig{


    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity)throws Exception{

            httpSecurity
                    .authorizeHttpRequests(http -> http.anyRequest().authenticated())
                    .httpBasic(Customizer.withDefaults());
           return httpSecurity.build();
    }
}
