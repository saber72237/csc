package com.yygq.csc.service;

import com.yygq.csc.bean.AdminDao;
import com.yygq.csc.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public AdminDao findByName(String name){ return adminMapper.getDeptById(name); }

    public int insertDept(AdminDao adminDao){
        return adminMapper.insertDept(adminDao);
    }

    public int updateDept(AdminDao adminDao){
        return adminMapper.updateDept(adminDao);
    }
}
