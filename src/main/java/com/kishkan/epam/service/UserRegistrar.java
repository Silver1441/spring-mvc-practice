package com.kishkan.epam.service;

import com.kishkan.epam.dto.RegisteredUserDto;

public interface UserRegistrar {
    void registerUser(RegisteredUserDto registeredUserDto);
}
