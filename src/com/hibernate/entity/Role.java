package com.hibernate.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * @author :Mr.Xu
 * Date    :2019-4-9
 */
public class Role {
    private Integer id;
    private String name;
    private Set<User> userSet = new HashSet<>();
    private Set<Menu> menuSet = new HashSet<>();

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

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    public Set<Menu> getMenuSet() {
        return menuSet;
    }

    public void setMenuSet(Set<Menu> menuSet) {
        this.menuSet = menuSet;
    }
}
