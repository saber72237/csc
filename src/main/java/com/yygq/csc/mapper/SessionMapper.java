package com.yygq.csc.mapper;

import com.yygq.csc.bean.SessionDao;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

public interface SessionMapper {
    @Select("select * from sys_purchase where class_id=#{classId}")
    @Results({
            @Result(property="userDao",column="id",one=@One(select="com.yygq.csc.mapper.UserMapper.getPurById"))
    })
    public SessionDao getDeptById(int classId);

    @Select("select * from sys_purchase where host_id=#{hostId}")
    @Results({
            @Result(property="userDao",column="id",one=@One(select="com.yygq.csc.mapper.UserMapper.getPurById"))
    })
    public Collection<SessionDao> getOrderById(int classId);
}
