package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@SpringBootApplication
@EnableResourceServer
public class RolebaseAuthApplication extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/hello/**").authenticated()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .and()
                .httpBasic();
    }

    public static void main(String[] args) {
        SpringApplication.run(RolebaseAuthApplication.class, args);
    }

}
