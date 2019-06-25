package com.pasindu.spring.springexceptionhandling.service;

import com.pasindu.spring.springexceptionhandling.model.User;

import java.text.ParseException;
import java.util.List;

public interface UserService {
    List<User> findAll() throws ParseException;
    List<User> findByFirstName(String firstName) throws ParseException;
}
