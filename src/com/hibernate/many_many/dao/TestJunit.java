package com.hibernate.many_many.dao;


import com.hibernate.entity.User;
import com.hibernate.many_many.entity.Menu;
import com.hibernate.many_many.entity.Role;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author :Mr.Xu
 * Date    :2019-4-9
 */
public class TestJunit {
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
    public void addUserAndRole(){


        Role role1 =new Role();
        role1.setName("管理员");

        Role role2 =new Role();
        role2.setName("保安");

        Menu m1 = new Menu();
        m1.setName("管理书籍");
        Menu m2 = new Menu();
        m2.setName("保护安全");

        role1.getMenuSet().add(m1);
        role1.getMenuSet().add(m2);

        role2.getMenuSet().add(m1);

        session.save(m1);
        session.save(m2);
        session.save(role1);
        session.save(role2);
    }


    @Test
    public void delete(){
        User user = session.get(User.class, 1);
        Role role = session.get(Role.class, 1);
        user.getRoleSet().remove(role);

    }



}
