package com.sourcecode.java8.stream;

import java.util.*;

public class JavaStreamExample8 {

    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        // count number of products based on the filter
        long count = productsList.stream()
                .filter(product -> product.price < 30000)
                .count();
        System.out.println(count);
    }

}
