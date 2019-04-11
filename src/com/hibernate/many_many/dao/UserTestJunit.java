package com.hibernate.many_many.dao;


import com.hibernate.many_many.entity.User;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author :Mr.Xu
 * Date    :2019-4-9
 */
public class UserTestJunit {
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
    public void addUserAndRole() {

        for (int i = 0; i <10 ; i++) {
            User user = new User("admin"+i);
            session.save(user);
        }
    }
    //Hql 查询所有
    @Test
    public void queryAll() {
        String hql ="from User  ";
        Query<User> query = session.createQuery(hql, User.class);
        List<User> list = query.list();
        for (User user: list) {
            System.out.println(user);
        }
    }

    //Hql 查询一个
    @Test
    public void queryOne() {
        String hql ="from User where id = :id ";
        Query<User> query = session.createQuery(hql, User.class);
        query.setParameter("id",1);
        User user = query.list().get(0);
        System.out.println(user);
    }

    //Hql 模糊查询
    @Test
    public void queryLike() {
        String hql ="from User where name like :name";
        Query<User> query = session.createQuery(hql, User.class);
        query.setParameter("name","a%");
        List<User> list = query.list();
        for (User user: list) {
            System.out.println(user);
        }
    }

    //Hql 命名查询
    @Test
    public void queryLike2() {
        String hql ="queryUser";
        Query query = session.getNamedQuery(hql);
        query.setParameter("name","a%");
        List<User> list = query.list();
        for (User user: list) {
            System.out.println(user);
        }

    }

    //Hql 命名查询
    @Test
    public void queryTou() {
        String hql = "select id,name from User";
        Query<Object[]> query = session.createQuery(hql, Object[].class);
        List<Object[]> list = query.list();
        for (Object[] objects:list){
            System.out.println(Arrays.toString(objects));
        }
    }

    //Hql 聚合查询(查询总条数)
    @Test
    public void queryPage() {

        String hql ="select count(*) from User  ";
        Query<Object> query = session.createQuery(hql, Object.class);
        Object object = query.uniqueResult();
        Number number = (Number)object;
        int i = number.intValue();
        System.out.println(i);
    }








}
