//package com.kishkan.epam.service;
//
//import com.kishkan.epam.entity.Employee;
//import com.kishkan.epam.repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class AuthenticationProviderImpl implements AuthenticationProvider {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        Employee user = employeeRepository.getEmployeeByLogin(authentication.getName());
//        String password = authentication.getCredentials().toString();
//
//        checkUserExistence(user);
//        checkUserPassword(user, password);
//
//        List<GrantedAuthority> authorities = new ArrayList<>();
//        return new UsernamePasswordAuthenticationToken(user, null, authorities);
//    }
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return aClass.equals(UsernamePasswordAuthenticationToken.class);
//    }
//
//    private void checkUserExistence(Employee user) {
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found!");
//        }
//    }
//
//    private void checkUserPassword(Employee user, String inputPassword) {
//        if (!user.getPassword().equals(inputPassword)) {
//            throw new BadCredentialsException("Wrong password!");
//        }
//    }
//}
