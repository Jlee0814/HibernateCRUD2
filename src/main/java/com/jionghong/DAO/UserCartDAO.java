package com.jionghong.DAO;

import com.jionghong.config.HibernateConfig;
import com.jionghong.entity.Cart;
import com.jionghong.entity.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Set;

public class UserCartDAO {

    public void insertProductToCart(int cartId, int productId){
        Session session = HibernateConfig.getSession();
        Transaction transaction = session.beginTransaction();

        Cart cart = session.get(Cart.class, cartId);
        Set<Product> products = cart.getProducts();
        System.out.println(cart);
        Product product = session.get(Product.class, productId);
        System.out.println(product);
        products.add(product);

        cart.setProducts(products);

        session.save(cart);
        transaction.commit();
        session.close();
    }

    public void deleteProductFromCart(int cartId, int productId){
        Session session = HibernateConfig.getSession();
        Transaction transaction = session.beginTransaction();
        Cart cart = session.get(Cart.class, cartId);
        Set<Product> products = cart.getProducts();
        Product product = session.get(Product.class, productId);
        if(products.contains(product)){
            products.remove(product);
        }
        cart.setProducts(products);
        session.update(cart);
        transaction.commit();
        session.close();
    }

}
