package com.dio.apirest.service;

import com.dio.apirest.domain.model.User;

import java.util.Optional;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);

}
