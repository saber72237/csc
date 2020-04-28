package com.yygq.csc.service;

import com.yygq.csc.bean.ClassDao;
import com.yygq.csc.bean.SignDao;
import com.yygq.csc.mapper.ClassMapper;
import com.yygq.csc.mapper.SessionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ClassService {

    @Autowired
    public ClassMapper classMapper;

    @Autowired
    public SessionMapper sessionMapper;


    public Collection<ClassDao> findByName(Integer hostId){ return classMapper.getDeptById(hostId); }

    public int deleteDeptById(int classId){ return classMapper.deleteDeptById(classId); }

   /* public int updateCon(ClassDao signDao){
        return classMapper.updateCon(signDao);
    }

    public int updateTime(ClassDao signDao){ return classMapper.updateTime(signDao); }*/
}
