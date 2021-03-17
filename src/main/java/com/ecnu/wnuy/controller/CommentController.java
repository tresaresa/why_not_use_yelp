package com.ecnu.wnuy.controller;

import com.ecnu.wnuy.domain.CommentDTO;
import com.ecnu.wnuy.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Shen Lei
 * @Date 2020/7/19 18:47
 */
@RestController
@CrossOrigin
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/allcomment/{resturantId}" ,method = RequestMethod.GET)
    @ResponseBody
    List<CommentDTO> getCommentsByResturantId(@PathVariable String resturantId) {
        System.out.println("resturant id:" + resturantId);
        return commentService.findCommentsByResturantId(resturantId);
    }

    @RequestMapping(value = "/childcomment/{commentId}" ,method = RequestMethod.GET)
    @ResponseBody
    List<CommentDTO> getCommentsById(@PathVariable String commentId) {
        System.out.println("comment id:" + commentId);
        return commentService.findCommentsById(Integer.parseInt(commentId));
    }

    @RequestMapping(value = "/comment-deletion/{id}", method = RequestMethod.GET)
    @ResponseBody
    int deleteCommentById(@PathVariable int commentId) {
        return commentService.deleteCommentById(commentId);
    }

    @RequestMapping(value = "/new-comment/{userId}/{resturantId}/{rating}/{content}", method = RequestMethod.GET)
    int createComment(@PathVariable String userId, @PathVariable String resturantId, @PathVariable int rating, @PathVariable String content) {
        return commentService.insertComment(userId, resturantId, rating, content);
    }
}
