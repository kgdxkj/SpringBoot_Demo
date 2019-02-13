package cn.wq.kgdxkj.dao;

import cn.wq.kgdxkj.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserDao {
    public List<User> findAll();

    int addUser(User user);
}
