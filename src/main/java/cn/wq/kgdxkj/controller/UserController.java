package cn.wq.kgdxkj.controller;

import cn.wq.kgdxkj.model.User;
import cn.wq.kgdxkj.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: SpringBoot_Demo
 * @description: 用户控制层
 * @author: Mr.Wu
 * @create: 2019-02-13 09:24
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/findAll")
    //http://localhost:8080/user/findAll
    public String findAll() {
        List<User> userList=userService.findAllUser();
        String usersJson = JSON.toJSONString(userList);
        return usersJson;
    }

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(@RequestBody User user){

        return userService.addUser(user);
    }
}
