package com.ecnu.wnuy.domain;

/**
 * @Author Shen Lei
 * @Date 2020/7/18 17:36
 */
public class UserDTO {

    private String id;
    private String nickname;
    private String gender;

    public UserDTO() {

    }

    public UserDTO(String id, String nickname, String gender) {
        this.id = id;
        this.nickname = nickname;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
