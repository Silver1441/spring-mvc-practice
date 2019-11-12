package com.kishkan.epam.service;

import com.kishkan.epam.dto.AuthorizedUserDto;

public interface UserService {
    AuthorizedUserDto getUser(String login);
}
