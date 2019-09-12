package cn.kgc.mybatis.mapper;

import cn.kgc.mybatis.bean.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select count(1) from smbms_user")
    public Integer getUserCount();

    @Select("select * from smbms_user")
    public List<User> getUserList();

}
