package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO user_info(name, account_id, token, gmt_create, gmt_modified) VALUES (#{name}, #{account_id}, #{token}, #{gmt_create}, #{gmt_modified})")
    void insert(User user);
}
