package com.hibernate.one_one.dao;

import com.hibernate.one_one.entity.Employee;
import com.hibernate.one_one.entity.HusBand;
import com.hibernate.one_one.entity.JoinPart;
import com.hibernate.one_one.entity.Wife;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author :Mr.Xu
 * Date    :2019-4-9
 */
public class EmployeeDao {

    private Session session=null;

    @Before
    public void doBefore(){
        session = HibernateUtil.getSession();
        session.beginTransaction();

    }
    @After
    public void doAfter(){

        session.getTransaction().commit();
        session.close();
    }
    @Test
    public void  add(){
        Employee employee =new Employee();
        employee.setName("小江");
        JoinPart joinPart =new JoinPart();
        joinPart.setPname("中共党员");

        employee.setJoinPart(joinPart);
        joinPart.setEmployee(employee);

        session.save(employee);
    }

}
