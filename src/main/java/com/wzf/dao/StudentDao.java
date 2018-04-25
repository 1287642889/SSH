package com.wzf.dao;

import com.wzf.pojo.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Component
public class StudentDao {

    //这里的sessionFactory由Spring进行注入
    @Autowired
    private SessionFactory sessionFactory;


    public List<Student> getAllStudent(){
        String hql = " from Student";
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }


    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
