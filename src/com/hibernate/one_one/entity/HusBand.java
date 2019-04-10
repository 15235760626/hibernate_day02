package com.hibernate.one_one.entity;

/**
 * @author :Mr.Xu
 * Date    :2019-4-10
 */
public class HusBand {
    private Integer id ;
    private String name;
    private Wife wife;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
