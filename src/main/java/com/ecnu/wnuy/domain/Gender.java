package com.ecnu.wnuy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author Shen Lei
 * @Date 2020/7/21 22:05
 */
@Entity
@Table(name = "gender")
public class Gender {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String description;

    public Gender() {

    }

    public Gender(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
