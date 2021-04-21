package com.validation.loginvalidation.service;

import com.validation.loginvalidation.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User save(User user);
}
