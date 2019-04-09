package com.hibernate.dao;

import com.hibernate.entity.Student;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
/**
 * @author :Mr.Xu
 * Date    :2019-4-9
 */
public class StudentDao {

    public static void main(String[] args)  throws Exception{
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Student student = new Student();
        student.setName("张飞");
        student.setAge(20);
        session.save(student);

        session.getTransaction().commit();
        session.close();

    }
}
