//
//  package com.infosys.employee.config;
//  
//  import org.springframework.context.annotation.Configuration;
//  
//  import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder; 
//  import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//  import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity; 
//  import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//  
//  
//  @Configuration
//  
//  @EnableWebSecurity 
//  
//  public class SecurityConfig extends WebSecurityConfigurerAdapter {
//  
//  @Override 
//  public void configure(AuthenticationManagerBuilder auth) throws Exception 
//  { 
//	  auth .inMemoryAuthentication()
//	  		.withUser("root").password("{noop}root").roles("USER"); 
//  }
//  
//  @Override 
//  protected void configure(HttpSecurity http) throws Exception 
//  { 
//	  http
//		  .cors() 
//		  .and() 
//		  .authorizeRequests() 
//		  .anyRequest().authenticated() 
//		  .and()
//		  .formLogin(); 
//  } 
// }
// 