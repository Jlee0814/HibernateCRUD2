package com.jionghong.DAO;

import com.jionghong.config.HibernateConfig;
import com.jionghong.entity.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProductDAO {

    public void insertProduct(Product product){
        Session session = HibernateConfig.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(product);
        transaction.commit();
        session.close();
    }

    public void deleteProduct(Product product){
        Session session = HibernateConfig.getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(product);
        transaction.commit();
        session.close();
    }

}
