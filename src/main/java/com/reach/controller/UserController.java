package com.reach.controller;

import com.reach.entity.PersonProperties;
import com.reach.entity.User;
import com.reach.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by abc83 on 2017/3/25.
 */
@RestController
public class UserController {

    @Autowired
    private PersonProperties personProperties;
    @Autowired
    private UserRepository repository;

    @RequestMapping("/")
    public Object showAge() {
        return personProperties.getFavor().getBook() + " "+ personProperties.getFavor().getPlay();
    }

    @RequestMapping("/list")
    public List<User> getUserList() {
        return repository.findAll();
    }

    @RequestMapping("/get/{age}")
    public User getByAge(@PathVariable("age") Integer age) {
        return repository.getUserByAge(age);
    }

}
