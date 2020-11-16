package com.jionghong.Controller;

import com.jionghong.DAO.ProductDAO;
import com.jionghong.entity.Product;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Enter 1 = insert product ; Enter 2 = delete product ; Enter 3 = quit");
            int x = scanner.nextInt();
            if(x==3) {
                flag=false;
                break;
            }
            else if(x==1) {
                ProductDAO productDAO = new ProductDAO();

                System.out.println("please enter product information");
                System.out.println("product name: ");
                String name = scanner.next();
                Product product = new Product();;
                product.setName(name);
                productDAO.insertProduct(product);
            }
            else if(x==2) {
                ProductDAO productDAO = new ProductDAO();

                System.out.println("please enter product information");
                System.out.print("product id: ");
                int id = scanner.nextInt();
                Product product = new Product();;
                product.setId(id);
                productDAO.deleteProduct(product);
            }
        }
    }
}

