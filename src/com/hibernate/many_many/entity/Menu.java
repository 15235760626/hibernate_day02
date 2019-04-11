package com.hibernate.many_many.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author :Mr.Xu
 * Date    :2019-4-9
 */
@Entity
@Table
public class Menu {
    private Integer id;
    private String name;
    private Set<Role> roleSet = new HashSet<>();

    @Id
    @GenericGenerator(name="_native", strategy = "native")
    @GeneratedValue(generator = "_native")
    @Column(name = "m_id")
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

    @ManyToMany(mappedBy = "menuSet")
    public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }
}
