package com.ecnu.wnuy.service;

import com.ecnu.wnuy.dao.CommentDAO;
import com.ecnu.wnuy.domain.CommentDTO;
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

    public List<CommentDTO> findCommentsByResturantId(String id) {
        return commentDAO.findCommentsByResturantId(id);
    }

    public List<CommentDTO> findCommentsById(int id) {
        return commentDAO.findCommentsById(id);
    }

    public int deleteCommentById(int id) {
        return commentDAO.deleteCommentById(id);
    }

    public int insertComment(String userId, String resturantId, int rating, String content) {
        return commentDAO.insertComment(userId, resturantId, rating, content, -1);
    }
}
