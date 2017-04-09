package com.reach.service;
/**
 * Created by abc83 on 2017/3/29.
 */

import com.reach.entity.User;
import com.reach.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.reach.mapper.UserMapper;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @author yangrui
 * @create 2017-03-29 22:06
 **/
@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private UserMapper mapper;

    public void insertUser() {
        User user = new User();
        user.setAge(26);
        user.setName("yangrui");
        repository.save(user);
    }

    public List<User> query() {
        return mapper.query();
    }

}
