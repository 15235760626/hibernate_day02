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
public class Role {
    private Integer id;
    private String name;
    private Set<Menu> menuSet = new HashSet<>();

    @Id
    @GenericGenerator(name="_native", strategy = "native")
    @GeneratedValue(generator = "_native")
    @Column(name = "r_id")
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


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "role_menu",
            joinColumns = {@JoinColumn(name = "r_id")},
            inverseJoinColumns = {@JoinColumn(name = "m_id")}
    )
    public Set<Menu> getMenuSet() {
        return menuSet;
    }

    public void setMenuSet(Set<Menu> menuSet) {
        this.menuSet = menuSet;
    }
}
