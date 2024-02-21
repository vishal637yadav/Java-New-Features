package com.sourcecode.java8.stream;

import java.util.*;

public class JavaStreamExample1 {

    public static void main(String[] args) {

        List<Product> ProductsList = new ArrayList<>();
        //Adding Products
        ProductsList.add(new Product(1, "HP Laptop", 25000f));
        ProductsList.add(new Product(2, "Dell Laptop", 30000f));
        ProductsList.add(new Product(3, "Lenevo Laptop", 28000f));
        ProductsList.add(new Product(4, "Sony Laptop", 28000f));
        ProductsList.add(new Product(5, "Apple Laptop", 90000f));

        List<Float> ProductPriceList = new ArrayList<>();
        for (Product Product : ProductsList) {
            // filtering data of list
            if (Product.price < 30000) {
                ProductPriceList.add(Product.price);    // adding price to a ProductPriceList  
            }
        }
        System.out.println(ProductPriceList);   // displaying data  
    }
}
