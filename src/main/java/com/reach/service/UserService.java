package com.reach.service;
/**
 * Created by abc83 on 2017/3/29.
 */

import com.reach.entity.User;
import com.reach.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author yangrui
 * @create 2017-03-29 22:06
 **/
@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository repository;

    public void insertUser() {
        User user = new User();
        user.setAge(26);
        user.setName("yangrui");
        repository.save(user);
    }
}
