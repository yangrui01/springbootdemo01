package com.reach.service;

import com.reach.entity.User;
import com.reach.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by root on 17-4-8.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper mapper;

    public List<User> query() {
        return mapper.query();
    }

}
