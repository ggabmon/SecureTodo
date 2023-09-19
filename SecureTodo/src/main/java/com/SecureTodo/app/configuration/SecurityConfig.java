package com.SecureTodo.app.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfiguration{
	
	/*
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
        .csrf().disable()
        .authorizeRequests()
            .antMatchers("/login**").permitAll() // 로그인 경로는 모든 사람이 접근 가능
            .anyRequest().authenticated() // 그 외 경로는 인증된 사용자만 접근 가능
        .and()
        .formLogin()
            .loginPage("/login") // 로그인 페이지 URL
            .defaultSuccessURL("/todo", true) // 로그인 성공 시 리다이렉트할 URL
        .and()
        .logout()
            .logoutUrl("/logout") // 로그아웃 URL
            .logoutSuccessUrl("/login"); // 로그아웃 성공 시 리다이렉트할 URL
	}
	*/
}
