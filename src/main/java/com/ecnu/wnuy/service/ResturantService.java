package com.ecnu.wnuy.service;

import com.ecnu.wnuy.dao.ResturantDAO;
import com.ecnu.wnuy.domain.Resturant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Shen Lei
 * @Date 2020/7/18 23:19
 */
@Service
public class ResturantService {

    @Autowired
    ResturantDAO resturantDAO;

    public List<Resturant> getAllResturant() {
        return resturantDAO.findAllResturant();
    }
}
