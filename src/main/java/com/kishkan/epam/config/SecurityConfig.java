package com.kishkan.epam.config;

import com.kishkan.epam.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/login").anonymous()
                    .antMatchers("/registration").permitAll()
                    .antMatchers("/registration/**").permitAll()
                    .antMatchers("/registrationSuccess").permitAll()

                    .antMatchers("/resources/css/**").permitAll()
                    .antMatchers("/resources/js/**").permitAll()
                    .antMatchers("/resources/images/**").permitAll()
                    .antMatchers("/resources/fonts/**").permitAll()

                    .anyRequest().authenticated()

                .and()
                    .csrf().disable()

                .formLogin()
                    .loginPage("/login")
                    .loginProcessingUrl("/login/process")
                    .defaultSuccessUrl("/home")
                    .failureUrl("/login?error")
                    .usernameParameter("login")
                    .passwordParameter("password")

                .and()
                    .logout();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder authentication) throws Exception {
        authentication.authenticationProvider(authProvider());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }
}
