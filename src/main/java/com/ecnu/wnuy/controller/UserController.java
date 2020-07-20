package com.ecnu.wnuy.controller;

import com.ecnu.wnuy.domain.User;
import com.ecnu.wnuy.domain.UserDTO;
import com.ecnu.wnuy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Shen Lei
 * @Date 2020/7/18 17:07
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/userinfo/{userId}")
    public User getUserById(@PathVariable String userId) {
        return userService.findUserById(userId);
    }

    @RequestMapping("/follower/{userId}")
    public List<User> getFollowerById(@PathVariable String userId) {
        return userService.findFollowerById(userId);
    }

    @RequestMapping("/followee/{userId}")
    public List<User> getFolloweeById(@PathVariable String userId) {
        return userService.findFolloweeById(userId);
    }
}
