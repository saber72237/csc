package com.yygq.csc.service;

import com.yygq.csc.bean.SignDao;
import com.yygq.csc.mapper.SignMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SignService {

    @Autowired
    private SignMapper signMapper;

    public SignDao findByName(int id){ return signMapper.getDeptById(id); }

    public Collection<SignDao> findById(Integer hostId){ return signMapper.getSignById(hostId); }

    public int insertDept(SignDao signDao){
        return signMapper.insertDept(signDao);
    }

    public int updateCon(SignDao signDao){
        return signMapper.updateCon(signDao);
    }

    public int updateTime(SignDao signDao){ return signMapper.updateTime(signDao); }
}
