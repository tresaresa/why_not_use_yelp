package com.ecnu.wnuy.dao;

import com.ecnu.wnuy.domain.CommentDTO;

import java.util.List;

/**
 * @Author Shen Lei
 * @Date 2020/7/24 0:28
 */
public interface CommentCustomDAO {

    List<CommentDTO> findCommentsByResturantId(String id);

    public List<CommentDTO> findCommentsById(int id);
}
