package com.yygq.csc.mapper;


import com.yygq.csc.bean.AdminDao;
import org.apache.ibatis.annotations.*;

public interface AdminMapper {

    @Select("select * from sys_administrator where admin_name=#{adminName}")
    public AdminDao getDeptById(String userName);

    @Delete("delete from sys_administrator where id=#{id}")
    public int deleteDeptById(Integer id);

    @Insert("insert into sys_administrator(admin_name) values(#{adminName})")
    public int insertDept(AdminDao adminDao);

    @Update("update sys_administrator set admin_password=#{adminPassword} where id=#{id}")
    public int updateDept(AdminDao adminDao);
}
