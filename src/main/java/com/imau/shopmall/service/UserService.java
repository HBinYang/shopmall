package com.imau.shopmall.service;

import com.imau.shopmall.bean.UserBean;

import java.util.List;

/**
 * @author HBYang
 * @date 2021/3/5 16:45
 */
public interface UserService {
    //添加用户
    public void save(String name);
    //删除用户
    public void delete(long id);
    //修改用户
    public Boolean update(UserBean user);
    //根据id查询一个用户和查询所有用户
    public UserBean findUser(int id,UserBean user);
    public  List<UserBean> findAllUsers(List<UserBean> users);
}
