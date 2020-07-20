package com.ecnu.wnuy.controller;

import com.ecnu.wnuy.domain.Comment;
import com.ecnu.wnuy.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Shen Lei
 * @Date 2020/7/19 18:47
 */
@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/allcomment/{resturantId}" ,method = RequestMethod.GET)
    @ResponseBody
    List<Comment> getCommentsByResturantId(@PathVariable String resturantId) {
        System.out.println("resturant id:" + resturantId);
        return commentService.findCommentsByResturantId(resturantId);
    }

    @RequestMapping(value = "/childcomment/{commentId}" ,method = RequestMethod.GET)
    @ResponseBody
    List<Comment> getCommentsById(@PathVariable String commentId) {
        System.out.println("comment id:" + commentId);
        return commentService.findCommentsById(Integer.parseInt(commentId));
    }
}
