package com.yygq.csc.mapper;

import com.yygq.csc.bean.AdminDao;
import com.yygq.csc.bean.ClassDao;
import org.apache.ibatis.annotations.*;

import java.util.Collection;

public interface ClassMapper {

    @Select("select * from sys_class where host_id=#{hostId}")
    @Results({
            @Result(property="sessionDao",column="class_id",one=@One(select="com.yygq.csc.mapper.SessionMapper.getDeptById"))
    })
    public Collection<ClassDao> getDeptById(Integer hostId);

    @Delete("delete from sys_class where class_id=#{classId}")
    public int deleteDeptById(Integer classId);

    /*@Insert("insert into sys_class(admin_name) values(#{adminName})")
    public int insertDept(ClassDao classDao);

    @Update("update sys_class set admin_password=#{adminPassword} where id=#{id}")
    public int updateDept(ClassDao classDao);*/
}
