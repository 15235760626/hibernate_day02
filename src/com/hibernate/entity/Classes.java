package com.hibernate.entity;

/**
 * @author :Mr.Xu
 * Date    :2019-4-9
 */
public class Classes {
    private Integer cid;
    private String name;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "cid=" + cid +
                ", name=" + name +
                '}';
    }
}
