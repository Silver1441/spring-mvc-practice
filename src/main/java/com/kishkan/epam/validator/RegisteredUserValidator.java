package com.kishkan.epam.validator;

import com.kishkan.epam.dto.RegisteredUserDto;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Service
public class RegisteredUserValidator implements Validator {
    private static final String REG_PASSWORD_CONFIRMATION_ERROR = "password confirmation didn't match";

    @Override
    public boolean supports(Class<?> aClass) {
        return RegisteredUserDto.class.equals(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        RegisteredUserDto user = (RegisteredUserDto) obj;
        if (!user.getPassword().equals(user.getPasswordConfirmation())) {
            errors.rejectValue("passwordConfirmation", "value.incorrect",
                    REG_PASSWORD_CONFIRMATION_ERROR);
        }
    }
}
