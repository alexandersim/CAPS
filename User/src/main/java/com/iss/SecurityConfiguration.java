package com.iss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity // Very important!
@EnableGlobalMethodSecurity(securedEnabled = true)
@Profile("dev")
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override // Very important!
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/user/admin/*")
		.hasRole("ADMIN")
		.and()
		.formLogin();
		}

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("password").roles("STUDENT");
		auth.inMemoryAuthentication().withUser("admin").password("password").roles("ADMIN");
	}
}

/*
 * http.authorizeRequests() .antMatchers("/user/new/*").hasAnyRole("USER",
 * "ADMIN") .antMatchers("/user/login/admin/*").hasAnyRole("USER", "ADMIN")
 * .antMatchers("/user/*").permitAll() .and() http.formLogin()
 * .loginPage("/user/") .loginProcessingUrl("/login")
 * .usernameParameter("username") .defaultSuccessUrl("/user/", true)
 * .defaultSuccessUrl("/new.html",true); .and() .logout()
 * .logoutUrl("/user/logout") .and() .csrf() .and() .exceptionHandling()
 * .accessDeniedPage("/user/forbidden"); super.configure(http);
 */ // Very important!
