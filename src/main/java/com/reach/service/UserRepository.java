package com.reach.service;

import com.reach.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by abc83 on 2017/3/28.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User getUserByAge(Integer age);
}



