package com.kishkan.epam.config;

import com.kishkan.epam.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;

@Configuration
@ComponentScan("com.kishkan.epa")
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Autowired
//    private AuthenticationProviderImpl authenticationProvider;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

//    public void registerGlobalAuthentication(AuthenticationManagerBuilder authentication) throws Exception {
//        authentication.userDetailsService(userDetailsService);
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/login").anonymous()
                    .antMatchers("/registration").anonymous()
                    .anyRequest().authenticated()
                .and().csrf().disable()
                .formLogin()
                    .loginPage("/login")
                    .loginProcessingUrl("/login/process")
                    .defaultSuccessUrl("/home")
                    .failureUrl("/login?error=true")
                    .usernameParameter("login")
                    .passwordParameter("password")
                .and().logout();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder authentication) throws Exception {
//        authentication.authenticationProvider(authenticationProvider);
        authentication.userDetailsService(userDetailsService);
    }
}
