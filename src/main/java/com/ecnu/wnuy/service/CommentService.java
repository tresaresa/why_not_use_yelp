package com.ecnu.wnuy.service;

import com.ecnu.wnuy.dao.CommentDAO;
import com.ecnu.wnuy.domain.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Shen Lei
 * @Date 2020/7/19 18:48
 */
@Service
public class CommentService {

    @Autowired
    private CommentDAO commentDAO;

    public List<Comment> findCommentsByResturantId(String id) {
        return commentDAO.findCommentsByResturantId(id);
    }

    public List<Comment> findCommentsById(int id) {
        return commentDAO.findCommentsById(id);
    }
}
