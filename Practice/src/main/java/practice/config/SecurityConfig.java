package practice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableWebSecurity
@Slf4j
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	public void configure(HttpSecurity http) throws Exception{
		log.info("Security Configure");
		http.authorizeRequests()
			.antMatchers("/board/list").permitAll();
		
		http.formLogin().loginPage("/customLogin").loginProcessingUrl("/login");
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception{
		log.info("Security Configure");
	}
}
