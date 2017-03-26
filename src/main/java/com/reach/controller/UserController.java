package com.reach.controller;

import com.reach.entity.PersonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abc83 on 2017/3/25.
 */
@RestController
public class UserController {

    @Autowired
    private PersonProperties personProperties;

    @RequestMapping("/")
    public Object showAge() {
        return personProperties.getFavor().getBook() + " "+ personProperties.getFavor().getPlay();
    }
}
