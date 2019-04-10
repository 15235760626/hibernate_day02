package com.hibernate.one_one.dao;

import com.hibernate.entity.Student;
import com.hibernate.one_one.entity.HusBand;
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
public class HusBandDao {

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
        Wife wife = new Wife();
        wife.setName("小乔");

        HusBand husBand =  new HusBand();
        husBand.setName("周瑜");

        husBand.setWife(wife);
        wife.setHusBand(husBand);

        session.save(husBand);
    }

}
