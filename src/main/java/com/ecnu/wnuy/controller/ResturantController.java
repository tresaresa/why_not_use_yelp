package com.ecnu.wnuy.controller;

import com.ecnu.wnuy.domain.Resturant;
import com.ecnu.wnuy.domain.User;
import com.ecnu.wnuy.service.ResturantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Shen Lei
 * @Date 2020/7/18 23:18
 */
@RestController
public class ResturantController {

    @Autowired
    ResturantService resturantService;

    @RequestMapping("/allresturant")
    public List<Resturant> getAllResturant() {
        return resturantService.getAllResturant();
    }
}
