# Java Stream Filter
* Java stream provides a **method filter()** to **filter stream elements** on the **basis of given predicate**. 
* Suppose you want to get only even elements of your list then you can do this easily with the help of filter method.

>[!Note]
>**filter()** method takes **predicate** as **an argument** and **returns a stream of consisting of resulted elements**.

## Signature
The signature of Stream filter() method is given below:

    Stream<T> filter(Predicate<? super T> predicate)  
### **Parameter**<br>
* predicate: It takes **Predicate** reference as **an argument**.<br> 
* Predicate is a functional interface. So, you can also pass lambda expression here.

### Return
* It returns a new stream.

## Java Stream filter() example
In the following example, we are fetching and iterating filtered data.

    package com.sourcecode.java8.stream;
    
    import java.util.*;
    
    public class JavaStreamExample12 {
    
        public static void main(String[] args) {
            List<Product> productsList = new ArrayList<Product>();
            //Adding Products
            productsList.add(new Product(1, "HP Laptop", 25000f));
            productsList.add(new Product(2, "Dell Laptop", 30000f));
            productsList.add(new Product(3, "Lenevo Laptop", 28000f));
            productsList.add(new Product(4, "Sony Laptop", 28000f));
            productsList.add(new Product(5, "Apple Laptop", 90000f));
    
            productsList.stream()
                    // filtering price
                    .filter(p -> p.price > 30000)
                    // fetching price
                    .map(pm -> pm.price)
                    // iterating price
                    .forEach(System.out::println);
    
        }
    }
  
### Output:
90000.0

## Java Stream filter() example 2
In the following example, we are fetching filtered data as a list.

    package com.sourcecode.java8.stream;
    
    import java.util.*;
    import java.util.stream.Collectors;
    
    public class JavaStreamExample13 {
    
        public static void main(String[] args) {
            List<Product> productsList = new ArrayList<>();
            //Adding Products
            productsList.add(new Product(1, "HP Laptop", 25000f));
            productsList.add(new Product(2, "Dell Laptop", 30000f));
            productsList.add(new Product(3, "Lenevo Laptop", 28000f));
            productsList.add(new Product(4, "Sony Laptop", 28000f));
            productsList.add(new Product(5, "Apple Laptop", 90000f));
    
            List<Float> pricesList = productsList.stream()
                    // filtering price
                    .filter(p -> p.price > 30000)
                    // fetching price
                    .map(pm -> pm.price)
                    .collect(Collectors.toList());
    
            System.out.println(pricesList);
        }
    
    }
  
### Output:
[90000.0]

