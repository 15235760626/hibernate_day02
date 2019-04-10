package com.hibernate.one_one.entity;

/**
 * @author :Mr.Xu
 * Date    :2019-4-10
 */
public class JoinPart {

    private Integer id ;
    private String pname;
    private Employee employee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
