package com.yygq.csc.service;

import com.yygq.csc.bean.ActiveDao;
import com.yygq.csc.mapper.ActiveMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ActiveService {

    @Autowired
    public ActiveMapper activeMapper;

    public Collection<ActiveDao> findByName(Integer hostId){ return activeMapper.getDeptById(hostId); }

    //public int deleteDeptById(int classId){ return activeMapper.deleteDeptById(classId); }
}
