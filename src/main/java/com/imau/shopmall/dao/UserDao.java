package com.imau.shopmall.dao;

import com.imau.shopmall.bean.UserBean;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author HBYang
 * @date 2021/3/5 16:57
 */
@Repository
@Mapper//说明他是mybatis型的一个映射
public interface UserDao {
    //增
    @Insert("INSERT INTO users(name) values (#{name})")
    void save(String name);
    //删
    @Delete("delete FROM users where id=#{id}")
    void delete(long id);
    //改
    @Update("update users set name=#{user.getname()} where id=#{id}")
    Boolean update(UserBean user);

    //查单 通过id
    @Select("select * from users where id=#{id}")
     UserBean findUser(int id,UserBean user);

    //查所有
    @Select("select * from users")
    public List<UserBean> findAllUsers(List<UserBean> users);
}
