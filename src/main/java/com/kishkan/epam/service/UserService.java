package com.kishkan.epam.service;

import com.kishkan.epam.dto.AppUser;

public interface UserService {
    AppUser getUser(String login);
}
