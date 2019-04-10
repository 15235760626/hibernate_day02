package com.hibernate.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * @author :Mr.Xu
 * Date    :2019-4-9
 */
public class Classes {
    private Integer cid;
    private String name;
    private Set<Student> students = new HashSet<Student>();

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

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
