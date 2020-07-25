package com.ecnu.wnuy.dao;

import com.ecnu.wnuy.domain.UserDTO;

/**
 * @Author Shen Lei
 * @Date 2020/7/23 23:45
 */
public interface UserCustomDAO {

    UserDTO findUserById(String id);

}
