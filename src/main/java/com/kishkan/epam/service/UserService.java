package com.kishkan.epam.service;

import com.kishkan.epam.dto.AuthorizedUser;

public interface UserService {
    AuthorizedUser getUser(String login);
}
