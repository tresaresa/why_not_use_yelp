package com.ecnu.wnuy.domain;

import javax.persistence.*;

/**
 * @Author Shen Lei
 * @Date 2020/7/18 23:14
 */
@Entity
@Table(name = "resturant")
public class Resturant {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    public Resturant() {

    }

    public Resturant(String id, String name, String description, String city, String street) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.city = city;
        this.street = street;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
