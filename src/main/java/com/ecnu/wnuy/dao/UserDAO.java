package com.ecnu.wnuy.dao;

import com.ecnu.wnuy.domain.User;
import com.ecnu.wnuy.domain.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Shen Lei
 * @Date 2020/7/18 17:40
 */
@Repository
public interface UserDAO extends JpaRepository<User, Integer> {

    String FIND_ALL_USER = "select * from user";
    String FIND_USER_BY_ID = "select * from user where id=:id";
    String FIND_FOLLOWER_BY_ID = "select user.id, user.nickname, user.gender " +
            "from user, follow " +
            "where user.id=follower_id and followee_id=:id";
    String FIND_FOLLOWEE_BY_ID = "select user.id, user.nickname, user.gender " +
            "from user, follow " +
            "where user.id=followee_id and follower_id=:id";

    @Query(value = FIND_ALL_USER, nativeQuery = true)
    List<User> findAllUser();

    @Query(value = FIND_USER_BY_ID, nativeQuery = true)
    User findUserById(@Param("id") String id);

    @Query(value = FIND_FOLLOWER_BY_ID, nativeQuery = true)
    List<User> findFollowerById(@Param("id") String id);

    @Query(value = FIND_FOLLOWEE_BY_ID, nativeQuery = true)
    List<User> findFolloweeById(@Param("id") String id);
}
