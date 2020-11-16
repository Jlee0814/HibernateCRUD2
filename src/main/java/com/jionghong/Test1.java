package com.jionghong;

import com.jionghong.DAO.UserCartDAO;
import com.jionghong.config.HibernateConfig;
import com.jionghong.entity.Cart;
import com.jionghong.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Test1 {
    @Test
    public void insert(){

        UserCartDAO userCartDAO = new UserCartDAO();
        userCartDAO.insertProductToCart(2,7);
    }
}
