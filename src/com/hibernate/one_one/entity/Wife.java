package com.hibernate.one_one.entity;

/**
 * @author :Mr.Xu
 * Date    :2019-4-10
 */
public class Wife {
    private Integer id ;
    private String name;
    private HusBand husBand;

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

    public HusBand getHusBand() {
        return husBand;
    }

    public void setHusBand(HusBand husBand) {
        this.husBand = husBand;
    }
}
