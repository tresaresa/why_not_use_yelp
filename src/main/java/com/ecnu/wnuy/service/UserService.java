package com.ecnu.wnuy.service;

import com.ecnu.wnuy.dao.UserDAO;
import com.ecnu.wnuy.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Shen Lei
 * @Date 2020/7/18 17:38
 */
@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public User findUserById(String id) {
        return userDAO.findUserById(id);
    }

    public List<User> findFollowerById(String id) {
        return userDAO.findFollowerById(id);
    }

    public List<User> findFolloweeById(String id) {
        return userDAO.findFolloweeById(id);
    }
}
