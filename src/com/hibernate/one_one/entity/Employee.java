package com.hibernate.one_one.entity;

/**
 * @author :Mr.Xu
 * Date    :2019-4-10
 */
public class Employee {
    private Integer id ;
    private String name;
    private JoinPart joinPart;

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

    public JoinPart getJoinPart() {
        return joinPart;
    }

    public void setJoinPart(JoinPart joinPart) {
        this.joinPart = joinPart;
    }
}
