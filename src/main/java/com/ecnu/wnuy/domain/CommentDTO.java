package com.ecnu.wnuy.domain;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * @Author Shen Lei
 * @Date 2020/7/24 0:25
 */
public class CommentDTO {

    private int id;
    private String userId;
    private String resturantId;
    private int rating;
    private String content;
    private int parentId;
    private String userName;

    public CommentDTO() {

    }

    public CommentDTO(int id, String userId, String resturantId, int rating, String content, int parentId, String userName) {
        this.id = id;
        this.userId = userId;
        this.resturantId = resturantId;
        this.rating = rating;
        this.content = content;
        this.parentId = parentId;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getResturantId() {
        return resturantId;
    }

    public void setResturantId(String resturantId) {
        this.resturantId = resturantId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
