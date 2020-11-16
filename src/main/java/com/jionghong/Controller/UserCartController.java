package com.jionghong.Controller;

import com.jionghong.DAO.ProductDAO;
import com.jionghong.DAO.UserCartDAO;
import com.jionghong.config.HibernateConfig;
import com.jionghong.entity.Cart;
import com.jionghong.entity.Product;
import org.hibernate.Session;

import java.util.Scanner;

public class UserCartController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.print("Enter 1 = insert product into Cart; Enter 2 = delete product from Cart; Enter 3 = quit");
            System.out.println();
            int x = scanner.nextInt();
            if(x==3) {
                flag = false;
                break;
            }
            else if(x==1) {
                UserCartDAO userCartDAO = new UserCartDAO();
                System.out.println("please enter Cart information");
                System.out.print("Cart id: ");
                int cartId = scanner.nextInt();

                System.out.println("please enter product information");
                System.out.print("product id: ");
                int productId = scanner.nextInt();

                userCartDAO.insertProductToCart(cartId,productId);
            }
            else if(x==2) {
                UserCartDAO userCartDAO = new UserCartDAO();
                System.out.println("please enter Cart information");
                System.out.println("Cart id: ");
                int cartId = scanner.nextInt();

                System.out.println("please enter product information");
                System.out.println("product id: ");
                int productId = scanner.nextInt();

                userCartDAO.deleteProductFromCart(cartId,productId);
            }
        }
    }
}
