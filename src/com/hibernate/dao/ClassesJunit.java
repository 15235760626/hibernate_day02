package com.hibernate.dao;

import com.hibernate.entity.Classes;
import com.hibernate.entity.Student;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

/**
 * @author :Mr.Xu
 * Date    :2019-4-10
 */
public class ClassesJunit {
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
    //多对1/1对多 双向绑定
    public void add(){
        Classes classes = new Classes();
        classes.setName("ui");

        Student s1= new Student();
        s1.setName("小花");
        s1.setClasses(classes);

        Student s2= new Student();
        s2.setName("小红");
        s2.setClasses(classes);

        classes.getStudents().add(s1);
        classes.getStudents().add(s2);

        session.save(s1);
        session.save(s2);
        session.save(classes);

    }

    @Test
    //查看学生的班级名称
    public void query (){
        Student s = session.get(Student.class, 1);
        System.out.println(s);

    }


    @Test
    //通过班级查找班级中的学生
    public void queryStudentByClass (){
        Classes classes = session.get(Classes.class, 1);
        Set<Student> students = classes.getStudents();
        for (Student student:students) {
            System.out.println(student);
        }
    }

    @Test
    //非关联修改
    public void delete(){
        Classes classes =session.get(Classes.class,1);
        classes.setName("Java01");
        Set<Student> students = classes.getStudents();
        for (Student student: students) {
            student.setAge(22);
        }
    }

    @Test
    //删除关联关系
    public void deleteAll(){
        Student student = session.get(Student.class, 1);
        student.setClasses(null);

    }
    @Test
    //修改关联关系--给学生添加班级
    public void update(){
        Student student = session.get(Student.class, 1);
        Classes classes = session.get(Classes.class, 1);
        student.setClasses(classes);
        classes.getStudents().add(student);


    }

    @Test
    //非关联修改
    public void deleteClasses(){
        Classes classes =session.get(Classes.class,1);
        session.delete(classes);
    }





}
