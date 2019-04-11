package com.hibernate.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * @author :Mr.Xu
 * Date    :2019-4-9
 */
public class User {
    private Integer id;
    private String name;
    private Set<Role> roleSet = new HashSet<>();

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

    public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }
}
