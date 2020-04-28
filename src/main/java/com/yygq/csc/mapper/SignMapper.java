package com.yygq.csc.mapper;

import com.yygq.csc.bean.SignDao;
import org.apache.ibatis.annotations.*;

import java.util.Collection;

public interface SignMapper {

    @Select("select * from sys_sign where id=#{id}")
    public SignDao getDeptById(int id);

    @Select("select * from sys_sign where host_id=#{hostId}")
    @Results({
            @Result(property="userDao",column="host_id",one=@One(select="com.yygq.csc.mapper.SessionMapper.getDeptById"))
    })
    public Collection<SignDao> getSignById(Integer hostId);

    @Insert("insert into sys_sign(id,host_id,sign_adress) values(#{id},#{hostId},#{signAdress})")
    public int insertDept(SignDao signDao);

    @Update("update sys_sign set continue_sign=#{continueSign} where id=#{id}")
    public int updateCon(SignDao signDao);

    @Update("update sys_sign set new_time=#{newTime} where id=#{id}")
    public int updateTime(SignDao signDao);
}
