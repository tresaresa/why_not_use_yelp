package com.ecnu.wnuy.dao;

import com.ecnu.wnuy.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Shen Lei
 * @Date 2020/7/18 17:40
 */
@Repository
public interface UserDAO extends JpaRepository<User, Integer>, UserCustomDAO {

    String FIND_FOLLOWER_BY_ID = "select user.id, user.nickname, user.gender " +
            "from user, follow " +
            "where user.id=follower_id and followee_id=:id";
    String FIND_FOLLOWEE_BY_ID = "select user.id, user.nickname, user.gender " +
            "from user, follow " +
            "where user.id=followee_id and follower_id=:id";
    String DELETE_FOLLOWEE = "delete from follow where followee_id=:id1 and follower_id=:id2";
    String CREATE_FOLLOW = "insert into follow values (:id2, :id1)";

    @Query(value = FIND_FOLLOWER_BY_ID, nativeQuery = true)
    List<User> findFollowerById(@Param("id") String id);

    @Query(value = FIND_FOLLOWEE_BY_ID, nativeQuery = true)
    List<User> findFolloweeById(@Param("id") String id);

    @Modifying
    @Transactional(rollbackFor = Exception.class)
    @Query(value = DELETE_FOLLOWEE, nativeQuery = true)
    int deleteFollowee(@Param("id1") String id1, @Param("id2") String id2);

    @Modifying
    @Transactional(rollbackFor = Exception.class)
    @Query(value = CREATE_FOLLOW, nativeQuery = true)
    int createFollow(@Param("id1") String id1, @Param("id2") String id2);

}
