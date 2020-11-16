package com.jionghong.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Product {
    private Integer id;
    private String name;
    Set<Cart> carts;
}
