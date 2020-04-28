package com.yygq.csc.service;

import com.yygq.csc.bean.UserDao;
import com.yygq.csc.mapper.SignMapper;
import com.yygq.csc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private SignMapper signMapper;

    public Collection<UserDao> findByName(Integer id){ return userMapper.getDeptById(id); }
}
