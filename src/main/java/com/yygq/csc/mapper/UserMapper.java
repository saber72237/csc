package com.yygq.csc.mapper;

import com.yygq.csc.bean.SignDao;
import com.yygq.csc.bean.UserDao;
import org.apache.ibatis.annotations.*;

import java.util.Collection;

public interface UserMapper {

    @Select("select * from sys_user where host_id=#{hostId}")
    @Results({
            @Result(property="signDao",column="id",one=@One(select="com.yygq.csc.mapper.SignMapper.getDeptById"))
    })
    public Collection<UserDao> getDeptById(Integer hostId);

    @Select("select * from sys_user where id=#{id}")
    public UserDao getPurById(int id);

    @Select("select * from sys_user where host_id=#{hostId}")
    public UserDao getActById(int hostId);

    @Delete("delete from sys_user where id=#{id}")
    public int deleteDeptById(Integer id);

    /*@Update("update sys_user set continue_sign=#{continueSign} where id=#{id}")
    public int updateCon(UserDao userDao);*/

    /*@Update("update sys_user set new_time=#{newTime} where id=#{id}")
    public int updateTime(UserDao userDao);*/
}
