package com.kishkan.epam.validator;

import com.kishkan.epam.dto.RegisteredUserDto;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Service
public class RegisteredUserValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return RegisteredUserDto.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        RegisteredUserDto user = (RegisteredUserDto) o;
        if (!user.getPassword().equals(user.getPasswordConfirmation())) {
            errors.rejectValue("passwordConfirmation", "value.negative");
        }
    }
}
