package com.hibernate.dao;

import com.hibernate.entity.Classes;
import com.hibernate.entity.Student;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.Test;

/**
 * @author :Mr.Xu
 * Date    :2019-4-9
 */
public class StudentJunit {

    @Test
    public void add(){
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Classes classes =new Classes();
        classes.setName("java班");
        session.save(classes);

        Student s1 =new Student();
        s1.setName("张三");
        s1.setClasses(classes);

        Student s2 =new Student();
        s2.setName("李四");
        s2.setClasses(classes);


        session.save(s1);
        session.save(s2);


        session.getTransaction().commit();
        session.close();

    }


}
