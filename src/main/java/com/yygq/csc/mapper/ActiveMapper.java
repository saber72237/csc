package com.yygq.csc.mapper;

import com.yygq.csc.bean.ActiveDao;
import org.apache.ibatis.annotations.*;

import java.util.Collection;

public interface ActiveMapper {

    @Select("select * from sys_activity where host_id=#{hostId}")
    @Results({
            @Result(property="userDao",column="host_id",one=@One(select="com.yygq.csc.mapper.ActiveMapper.getActById"))
    })
    public Collection<ActiveDao> getDeptById(Integer hostId);


    @Select("select * from activity—_user where host_id=#{hostId}")
    @Results({
            @Result(property="userDao",column="host_id",one=@One(select="com.yygq.csc.mapper.UserMapper.getActById"))
    })
    public Collection<ActiveDao> getActById(Integer hostId);

    /*@Insert("insert into sys_administrator(admin_name) values(#{adminName})")
    public int insertDept(AdminDao adminDao);

    @Update("update sys_administrator set admin_password=#{adminPassword} where id=#{id}")
    public int updateDept(AdminDao adminDao);*/
}
