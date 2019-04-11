package com.hibernate.dao;

import com.hibernate.entity.Menu;
import com.hibernate.entity.Role;
import com.hibernate.entity.User;
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
        User user1 = new User();
        user1.setName("张三");

        User user2 = new User();
        user2.setName("李四");


        Role role1 =new Role();
        role1.setName("书籍管理员");

        Role role2 =new Role();
        role2.setName("书籍管理员");

        user1.getRoleSet().add(role1);
        user1.getRoleSet().add(role2);

        user2.getRoleSet().add(role1);

        session.save(user1);
        session.save(user2);

    }

    @Test
    public void add(){
        User user = new User();
        user.setName("张三");

        Role role =new Role();
        role.setName("管理员");

        Menu menu = new Menu();
        menu.setName("管理人呀");

        user.getRoleSet().add(role);
        role.getMenuSet().add(menu);

        session.save(user);
        session.save(role);
    }
    @Test
    public void delete(){
        User user = session.get(User.class, 1);
        Role role = session.get(Role.class, 1);
        user.getRoleSet().remove(role);

    }



}
