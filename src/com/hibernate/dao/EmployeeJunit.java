package com.hibernate.dao;

import com.hibernate.entity.Department;
import com.hibernate.entity.Employee;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.Test;

/**
 * @author :Mr.Xu
 * Date    :2019-4-9
 */
public class EmployeeJunit {

    @Test
    public void test(){
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Department department = new Department();
        department.setName("人事部");
        session.save(department);

        Employee e1 = new Employee();
        e1.setName("张三");
        e1.setDepartment(department);

        Employee e2 = new Employee();
        e2.setName("李四");
        e2.setDepartment(department);


        session.save(e1);
        session.save(e2);



        session.getTransaction().commit();
        session.close();

    }


}
