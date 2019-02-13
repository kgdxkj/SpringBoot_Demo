package cn.wq.kgdxkj.service;

import cn.wq.kgdxkj.model.User;

import java.util.List;

public interface UserService {
    public List<User> findAllUser();

    int addUser(User user);
}
