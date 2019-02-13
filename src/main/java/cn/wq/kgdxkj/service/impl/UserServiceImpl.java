package cn.wq.kgdxkj.service.impl;

import cn.wq.kgdxkj.dao.UserDao;
import cn.wq.kgdxkj.model.User;
import cn.wq.kgdxkj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: SpringBoot_Demo
 * @description: 用户service实现类
 * @author: Mr.Wu
 * @create: 2019-02-13 09:48
 **/
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    public UserDao userDao; //这里会报错，但是并不会影响

    public List<User> findAllUser(){
        List<User> list=userDao.findAll();
        return list;
    }


    @Override
    //@Transactional   //事务
    public int addUser(User user) {

        userDao.addUser(user);

        int a = 1/0;
        user.setUserid(999);
        user.setUsername("中国");
        user.setPassword("4444444");
        user.setPhone("110");
        userDao.addUser(user);

        return 1;
    }
}
