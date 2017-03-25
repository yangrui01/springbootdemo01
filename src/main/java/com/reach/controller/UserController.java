package com.reach.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abc83 on 2017/3/25.
 */
@RestController
public class UserController {

    @RequestMapping("/")
    public Integer showAge() {
        return 1991;
    }
}
