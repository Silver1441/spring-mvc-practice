package com.kishkan.epam.validator;

import org.springframework.stereotype.Service;

@Service
public class PasswordInputRestValidator {
    private static final int MIN_PASSWORD_LENGTHT = 6;
    private static final int MAX_PASSWORD_LENGTHT = 30;

    public String validatePassword(String input) {
        if (input.length() < MIN_PASSWORD_LENGTHT) {
            return "invalid_short";
        } else if (input.length() > MAX_PASSWORD_LENGTHT) {
            return "invalid_long";
        } else if(input.equals("")) {
            return "empty";
        } else {
            return "valid";
        }
    }
}
