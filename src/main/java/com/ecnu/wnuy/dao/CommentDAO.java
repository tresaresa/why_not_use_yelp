package com.ecnu.wnuy.dao;

import com.ecnu.wnuy.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Shen Lei
 * @Date 2020/7/19 20:31
 */
@Repository
public interface CommentDAO extends JpaRepository<Comment, Integer> {

    @Query(value = "select * from comment where resturant_id=:id and parent_id=-1", nativeQuery = true)
    List<Comment> findCommentsByResturantId(@Param("id") String id);

    @Query(value = "select * from comment where parent_id=:id", nativeQuery = true)
    List<Comment> findCommentsById(@Param("id") int id);
}
