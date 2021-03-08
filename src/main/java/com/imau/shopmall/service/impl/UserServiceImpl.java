package com.imau.shopmall.service.impl;

import com.imau.shopmall.bean.UserBean;
import com.imau.shopmall.dao.UserDao;
import com.imau.shopmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

/**
 * @author HBYang
 * @date 2021/3/5 16:44
 */
@EnableTransactionManagement//将事务传进来
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;

    @Override
    public void save(String name) {
        dao.save(name);
    }

    @Override
    public void delete(long id) {
        dao.delete(1);
    }

    @Override
    public Boolean update(UserBean user) {
        dao.update(user);

        return  dao.update(user);
    }

    @Override
    public UserBean findUser(int id, UserBean user) {
        return null;
    }

    @Override
    public List<UserBean> findAllUsers(List<UserBean> users) {
        return null;
    }
}
