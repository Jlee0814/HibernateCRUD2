package com.jionghong.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
    private static SessionFactory sessionFactory  = new Configuration().configure().buildSessionFactory();
    private static Session session;

    public static Session getSession(){
        session = sessionFactory.openSession();
        return session;
    }
}
