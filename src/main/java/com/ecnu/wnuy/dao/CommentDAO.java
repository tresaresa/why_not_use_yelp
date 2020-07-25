package com.ecnu.wnuy.dao;

import com.ecnu.wnuy.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Shen Lei
 * @Date 2020/7/19 20:31
 */
@Repository
public interface CommentDAO extends JpaRepository<Comment, Integer>, CommentCustomDAO {

    String DELETE_COMMENT = "delete from comment where id=:id";
    String INSERT_COMMENT = "insert into comment (" +
                            " user_id, resturant_id, rating, content, parent_id)" +
                            " values (:user_id, :resturant_id, :rating, :content, :parent_id)";

    @Modifying
    @Transactional(rollbackFor = Exception.class)
    @Query(value = DELETE_COMMENT, nativeQuery = true)
    int deleteCommentById(@Param("id") int id);

    @Modifying
    @Transactional(rollbackFor = Exception.class)
    @Query(value = INSERT_COMMENT, nativeQuery = true)
    int insertComment(@Param("user_id") String userId, @Param("resturant_id") String resturantId, @Param("rating") int rating,
                      @Param("content") String content, @Param("parent_id") int parentId);
}
