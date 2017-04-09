package com.reach.mapper;

import com.reach.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by root on 17-4-8.
 */
@Mapper
public interface UserMapper {

    List<User> query();

}
