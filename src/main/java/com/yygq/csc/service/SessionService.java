package com.yygq.csc.service;

import com.yygq.csc.bean.SessionDao;
import com.yygq.csc.mapper.SessionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SessionService {

    @Autowired
    public SessionMapper sessionMapper;

    public Collection<SessionDao> findByName(Integer hostId){ return sessionMapper.getOrderById(hostId); }
}
