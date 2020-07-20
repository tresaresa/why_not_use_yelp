package com.ecnu.wnuy.dao;

import com.ecnu.wnuy.domain.Resturant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Shen Lei
 * @Date 2020/7/18 23:18
 */
@Repository
public interface ResturantDAO extends JpaRepository<Resturant, Integer> {

    @Query(value = "select * from resturant", nativeQuery = true)
    List<Resturant> findAllResturant();
}
