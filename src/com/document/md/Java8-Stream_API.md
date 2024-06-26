# Java 8 Stream
* Java provides a new additional package in Java 8 called java.util.stream. 
* This package consists of classes, interfaces and enum to allows functional-style operations on the elements. 
* You can use stream by importing java.util.stream package.

## Stream provides following features:
* Stream does not store elements. It simply conveys elements from a source such as a data structure, 
an array, or an I/O channel, through a pipeline of computational operations.
* Stream is functional in nature. Operations performed on a stream does not modify it's source.
 For example, filtering a Stream obtained from a collection produces a new Stream without the 
* filtered elements, rather than removing elements from the source collection.
* Stream is lazy and evaluates code only when required.
* The elements of a stream are only visited once during the life of a stream. Like an Iterator, 
a new stream must be generated to revisit the same elements of the source.
* You can use stream to filter, collect, print, and convert from one data structure to other etc. 
In the following examples, we have apply various operations with the help of stream.

## Java Stream Interface Methods

| Methods                                                                                            | 	Description                                                                                                                                                                                                                                                                                                                                                                       |
|----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| boolean allMatch(Predicate<? super T> predicate)                                                   | 	It returns all elements of this stream which match the provided predicate. If the stream is empty then true is returned and the predicate is not evaluated.                                                                                                                                                                                                                       |
| boolean anyMatch(Predicate<? super T> predicate)                                                   | 	It returns any element of this stream that matches the provided predicate. If the stream is empty then false is returned and the predicate is not evaluated.                                                                                                                                                                                                                      |
| static <T> Stream.Builder<T> builder()                                                             | 	It returns a builder for a Stream.                                                                                                                                                                                                                                                                                                                                                |
| <R,A> R collect(Collector<? super T,A,R> collector)                                                | 	It performs a mutable reduction operation on the elements of this stream using a Collector. A Collector encapsulates the functions used as arguments to collect(Supplier, BiConsumer, BiConsumer), allowing for reuse of collection strategies and composition of collect operations such as multiple-level grouping or partitioning.                                             |
| <R> R collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner) | 	It performs a mutable reduction operation on the elements of this stream. A mutable reduction is one in which the reduced value is a mutable result container, such as an ArrayList, and elements are incorporated by updating the state of the result rather than by replacing the result.                                                                                       |
| static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)                          | 	It creates a lazily concatenated stream whose elements are all the elements of the first stream followed by all the elements of the second stream. The resulting stream is ordered if both of the input streams are ordered, and parallel if either of the input streams is parallel. When the resulting stream is closed, the close handlers for both input streams are invoked. |
| long count()                                                                                       | 	It returns the count of elements in this stream. This is a special case of a reduction.                                                                                                                                                                                                                                                                                           |
| Stream<T> distinct()                                                                               | 	It returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream.                                                                                                                                                                                                                                                                      |
| static <T> Stream<T> empty()                                                                       | 	It returns an empty sequential Stream.                                                                                                                                                                                                                                                                                                                                            |
| Stream<T> filter(Predicate<? super T> predicate)                                                   | 	It returns a stream consisting of the elements of this stream that match the given predicate.                                                                                                                                                                                                                                                                                     |
| Optional<T> findAny()                                                                              | 	It returns an Optional describing some element of the stream, or an empty Optional if the stream is empty.                                                                                                                                                                                                                                                                        |
| Optional<T> findFirst()                                                                            | 	It returns an Optional describing the first element of this stream, or an empty Optional if the stream is empty. If the stream has no encounter order, then any element may be returned.                                                                                                                                                                                          |
| <R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)                    | 	It returns a stream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element. Each mapped stream is closed after its contents have been placed into this stream. (If a mapped stream is null an empty stream is used, instead.)                                 |
| DoubleStream flatMapToDouble(Function<? super T,? extends DoubleStream> mapper)                    | 	It returns a DoubleStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element. Each mapped stream is closed after its contents have placed been into this stream. (If a mapped stream is null an empty stream is used, instead.)                           |
| IntStream flatMapToInt(Function<? super T,? extends IntStream> mapper)                             | 	It returns an IntStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element. Each mapped stream is closed after its contents have been placed into this stream. (If a mapped stream is null an empty stream is used, instead.)                             |
| LongStream flatMapToLong(Function<? super T,? extends LongStream> mapper)                          | 	It returns a LongStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element. Each mapped stream is closed after its contents have been placed into this stream. (If a mapped stream is null an empty stream is used, instead.)                             |
| void forEach(Consumer<? super T> action)                                                           | 	It performs an action for each element of this stream.                                                                                                                                                                                                                                                                                                                            |
| void forEachOrdered(Consumer<? super T> action)                                                    | 	It performs an action for each element of this stream, in the encounter order of the stream if the stream has a defined encounter order.                                                                                                                                                                                                                                          |
| static <T> Stream<T> generate(Supplier<T> s)                                                       | 	It returns an infinite sequential unordered stream where each element is generated by the provided Supplier. This is suitable for generating constant streams, streams of random elements, etc.                                                                                                                                                                                   |
| static <T> Stream<T> iterate(T seed,UnaryOperator<T> f)                                            | 	It returns an infinite sequential ordered Stream produced by iterative application of a function f to an initial element seed, producing a Stream consisting of seed, f(seed), f(f(seed)), etc.                                                                                                                                                                                   |
| Stream<T> limit(long maxSize)                                                                      | 	It returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length.                                                                                                                                                                                                                                                                  |
| <R> Stream<R> map(Function<? super T,? extends R> mapper)                                          | 	It returns a stream consisting of the results of applying the given function to the elements of this stream.                                                                                                                                                                                                                                                                      |
| DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper)                                       | 	It returns a DoubleStream consisting of the results of applying the given function to the elements of this stream.                                                                                                                                                                                                                                                                |
| IntStream mapToInt(ToIntFunction<? super T> mapper)                                                | 	It returns an IntStream consisting of the results of applying the given function to the elements of this stream.                                                                                                                                                                                                                                                                  |
| LongStream mapToLong(ToLongFunction<? super T> mapper)                                             | 	It returns a LongStream consisting of the results of applying the given function to the elements of this stream.                                                                                                                                                                                                                                                                  |
| Optional<T> max(Comparator<? super T> comparator)                                                  | 	It returns the maximum element of this stream according to the provided Comparator. This is a special case of a reduction.                                                                                                                                                                                                                                                        |
| Optional<T> min(Comparator<? super T> comparator)                                                  | 	It returns the minimum element of this stream according to the provided Comparator. This is a special case of a reduction.                                                                                                                                                                                                                                                        |
| boolean noneMatch(Predicate<? super T> predicate)                                                  | 	It returns elements of this stream match the provided predicate. If the stream is empty then true is returned and the predicate is not evaluated.                                                                                                                                                                                                                                 |
| @SafeVarargs static <T> Stream<T> of(T... values)                                                  | 	It returns a sequential ordered stream whose elements are the specified values.                                                                                                                                                                                                                                                                                                   |
| static <T> Stream<T> of(T t)                                                                       | 	It returns a sequential Stream containing a single element.                                                                                                                                                                                                                                                                                                                       |
| Stream<T> peek(Consumer<? super T> action)                                                         | 	It returns a stream consisting of the elements of this stream, additionally performing the provided action on each element as elements are consumed from the resulting stream.                                                                                                                                                                                                    |
| Optional<T> reduce(BinaryOperator<T> accumulator)                                                  | 	It performs a reduction on the elements of this stream, using an associative accumulation function, and returns an Optional describing the reduced value, if any.                                                                                                                                                                                                                 |
| T reduce(T identity, BinaryOperator<T> accumulator)                                                | 	It performs a reduction on the elements of this stream, using the provided identity value and an associative accumulation function, and returns the reduced value.                                                                                                                                                                                                                |
| <U> U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)        | 	It performs a reduction on the elements of this stream, using the provided identity, accumulation and combining functions.                                                                                                                                                                                                                                                        |
| Stream<T> skip(long n)                                                                             | 	It returns a stream consisting of the remaining elements of this stream after discarding the first n elements of the stream. If this stream contains fewer than n elements then an empty stream will be returned.                                                                                                                                                                 |
| Stream<T> sorted()                                                                                 | 	It returns a stream consisting of the elements of this stream, sorted according to natural order. If the elements of this stream are not Comparable, a java.lang.ClassCastException may be thrown when the terminal operation is executed.                                                                                                                                        |
| Stream<T> sorted(Comparator<? super T> comparator)                                                 | 	It returns a stream consisting of the elements of this stream, sorted according to the provided Comparator.                                                                                                                                                                                                                                                                       |
| Object[] toArray()                                                                                 | 	It returns an array containing the elements of this stream.                                                                                                                                                                                                                                                                                                                       |
| <A> A[] toArray(IntFunction<A[]> generator)                                                        | 	It returns an array containing the elements of this stream, using the provided generator function to allocate the returned array, as well as any additional arrays that might be required for a partitioned execution or for resizing.                                                                                                                                            |


## Java Example: **Filtering Collection** **without using Stream**
In the following example, we are filtering data without using stream. This approach we are used before the stream package was released.
### Common Product.java
    package com.sourcecode.java8.stream;
    
    public class Product {
    int id;
    String name;
    float price;
    
        public Product(int id, String name, float price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public int getId() {
            return id;
        }
    
        public String getName() {
            return name;
        }
    
        public float getPrice() {
            return price;
        }

    }

### JavaStreamExample1.java

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
                    // adding price to a ProductPriceList
                    ProductPriceList.add(Product.price);      
                }
            }
            // displaying data
            System.out.println(ProductPriceList);     
        }
    }

## Output:
[25000.0, 28000.0, 28000.0]

## Java Stream Example: Filtering Collection by using Stream
Here, we are filtering data by using stream. You can see that code is optimized and maintained. 
Stream provides fast execution.

    package com.sourcecode.java8.stream;
    
    import java.util.*;
    import java.util.stream.Collectors;
    
    public class JavaStreamExample2 {
    
        public static void main(String[] args) {
    
            List<Product> productsList = new ArrayList<Product>();
            //Adding Products
            productsList.add(new Product(1, "HP Laptop", 25000f));
            productsList.add(new Product(2, "Dell Laptop", 30000f));
            productsList.add(new Product(3, "Lenevo Laptop", 28000f));
            productsList.add(new Product(4, "Sony Laptop", 28000f));
            productsList.add(new Product(5, "Apple Laptop", 90000f));
    
            List<Float> productPriceList2 = productsList.stream()
                    // filtering data
                    .filter(p -> p.price > 30000)
                    // fetching price
                    .map(p -> p.price)        
                    // collecting as list
                    .collect(Collectors.toList()); 
            System.out.println(productPriceList2);
    
        }
    }

## Output:
[90000.0]

## Java Stream Iterating Example
You can use stream to iterate any number of times. Stream provides predefined methods to deal with the logic you implement. In the following example, we are iterating, filtering and passed a limit to fix the iteration.

    package com.sourcecode.java8.stream;
    
    import java.util.stream.*;
    
    public class JavaStreamExample3 {
    
        public static void main(String[] args) {
    
            Stream.iterate(1, element -> element + 1)
                    .filter(element -> element % 5 == 0)
                    .limit(5)
                    .forEach(System.out::println);
            
        }
    }


### Output:

5<br>
10<br>
15<br>
20<br>
25<br>

## Java Stream Example: Filtering and Iterating Collection
In the following example, we are using filter() method. Here, you can see code is optimized and very concise.

    package com.sourcecode.java8.stream;
    
    import java.util.List;
    import java.util.ArrayList;
    
    public class JavaStreamExample4 {
    
        public static void main(String[] args) {
            List<Product> productsList = new ArrayList<>();
            //Adding Products
            productsList.add(new Product(1,"HP Laptop",25000f));
            productsList.add(new Product(2,"Dell Laptop",30000f));
            productsList.add(new Product(3,"Lenevo Laptop",28000f));
            productsList.add(new Product(4,"Sony Laptop",28000f));
            productsList.add(new Product(5,"Apple Laptop",90000f));
    
            // This is more compact approach for filtering data
            productsList.stream()
                    .filter(product -> product.price == 30000)
                    .forEach(product -> System.out.println(product.name));
        }
    
    }
  
### Output:
Dell Laptop

## Java Stream Example : reduce() Method in Collection
This method takes a sequence of input elements and combines them into a single summary result by repeated operation. For example, finding the sum of numbers, or accumulating elements into a list.

In the following example, we are using reduce() method, which is used to sum of all the product prices.

    package com.sourcecode.java8.stream;
    
    import java.util.*;
    
    public class JavaStreamExample5 {
    
        public static void main(String[] args) {
            List<Product> productsList = new ArrayList<>();
            //Adding Products
            productsList.add(new Product(1, "HP Laptop", 25000f));
            productsList.add(new Product(2, "Dell Laptop", 30000f));
            productsList.add(new Product(3, "Lenevo Laptop", 28000f));
            productsList.add(new Product(4, "Sony Laptop", 28000f));
            productsList.add(new Product(5, "Apple Laptop", 90000f));
    
            // This is more compact approach for filtering data
            Float totalPrice = productsList.stream()
                    .map(product -> product.price)
                    // accumulating price
                    .reduce(0.0f, (sum, price) -> sum + price);   
            System.out.println(totalPrice);
    
            // More precise code
            float totalPrice2 = productsList.stream()
                    .map(product -> product.price)
                    // accumulating price, by referring method of Float class
                    .reduce(0.0f, Float::sum);
            System.out.println(totalPrice2);
    
        }
    
    }

### Output:

201000.0<br>
201000.0<br>

## Java Stream Example: Sum by using Collectors Methods
We can also use collectors to compute sum of numeric values. In the following example, we are using Collectors class and it?s specified methods to compute sum of all the product prices.

    package com.sourcecode.java8.stream;
    
    import java.util.*;
    import java.util.stream.Collectors;
    
    public class JavaStreamExample6 {
    
        public static void main(String[] args) {
    
            List<Product> productsList = new ArrayList<Product>();
            //Adding Products
            productsList.add(new Product(1,"HP Laptop",25000f));
            productsList.add(new Product(2,"Dell Laptop",30000f));
            productsList.add(new Product(3,"Lenevo Laptop",28000f));
            productsList.add(new Product(4,"Sony Laptop",28000f));
            productsList.add(new Product(5,"Apple Laptop",90000f));
            // Using Collectors's method to sum the prices.
            double totalPrice3 = productsList.stream()
                    .collect(Collectors.summingDouble(product->product.price));
            System.out.println(totalPrice3);
    
        }
    
    }
  
### Output:
201000.0

## Java Stream Example: Find Max and Min Product Price
Following example finds min and max product price by using stream. It provides convenient way to find values without using imperative approach.

    package com.sourcecode.java8.stream;
    
    import java.util.*;
    
    public class JavaStreamExample7 {
    
        public static void main(String[] args) {
            List<Product> productsList = new ArrayList<Product>();
            //Adding Products
            productsList.add(new Product(1, "HP Laptop", 25000f));
            productsList.add(new Product(2, "Dell Laptop", 30000f));
            productsList.add(new Product(3, "Lenevo Laptop", 28000f));
            productsList.add(new Product(4, "Sony Laptop", 28000f));
            productsList.add(new Product(5, "Apple Laptop", 90000f));
    
            // max() method to get max Product price
            Product productA = productsList.stream()
                    .max((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
            System.out.println(productA.price);
            // min() method to get min Product price
            Product productB = productsList.stream()
                    .min((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
            System.out.println(productB.price);

        }
    
    }
    
### Output:

90000.0<br>
25000.0

## Java Stream Example: count() Method in Collection

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
  
### Output:

3

>[!Important]
> **Stream** allows you to **collect** your **result** in any various forms.<br>
> You **can get** you **result** as **set**, **list** or **map** and can **perform manipulation** on the **elements**.

## Java Stream Example : Convert List into Set

    package com.sourcecode.java8.stream;
    
    import java.util.*;
    import java.util.stream.Collectors;
    
    public class JavaStreamExample9 {
    
        public static void main(String[] args) {
            List<Product> productsList = new ArrayList<Product>();
            //Adding Products
            productsList.add(new Product(1, "HP Laptop", 25000f));
            productsList.add(new Product(2, "Dell Laptop", 30000f));
            productsList.add(new Product(3, "Lenevo Laptop", 28000f));
            productsList.add(new Product(4, "Sony Laptop", 28000f));
            productsList.add(new Product(5, "Apple Laptop", 90000f));
    
            // Converting product List into Set
            Set<Float> productPriceList =

                        productsList.stream()
                            
                            // filter product on the base of price
                            .filter(product -> product.price < 30000)

                            // extracting the product.price from product and mapping it. 
                            .map(product -> product.price)
                            
                            // collect it as Set(remove duplicate elements)
                            .collect(Collectors.toSet());

            System.out.println(productPriceList);
        }
    
    }
  
### Output:

[25000.0, 28000.0]

## Java Stream Example : Convert List into Map
    package com.sourcecode.java8.stream;
    
    import java.util.*;
    import java.util.stream.Collectors;
    
    public class JavaStreamExample10 {
    
        public static void main(String[] args) {
            List<Product> productsList = new ArrayList<Product>();
    
            //Adding Products
            productsList.add(new Product(1, "HP Laptop", 25000f));
            productsList.add(new Product(2, "Dell Laptop", 30000f));
            productsList.add(new Product(3, "Lenevo Laptop", 28000f));
            productsList.add(new Product(4, "Sony Laptop", 28000f));
            productsList.add(new Product(5, "Apple Laptop", 90000f));
    
            // Converting Product List into a Map
            Map<Integer, String> productPriceMap =
                    productsList.stream()
                            .collect(Collectors.toMap(p -> p.id, p -> p.name));
    
            System.out.println(productPriceMap);
        }
    
    }

### Output:

{1=HP Laptop, 2=Dell Laptop, 3=Lenevo Laptop, 4=Sony Laptop, 5=Apple Laptop}

## Method Reference in stream

    package com.sourcecode.java8.stream;
    
    import java.util.*;
    import java.util.stream.Collectors;
    
    public class JavaStreamExample11 {
    
        public static void main(String[] args) {
    
            List<Product> productsList = new ArrayList<>();
    
            //Adding Products
            productsList.add(new Product(1, "HP Laptop", 25000f));
            productsList.add(new Product(2, "Dell Laptop", 30000f));
            productsList.add(new Product(3, "Lenevo Laptop", 28000f));
            productsList.add(new Product(4, "Sony Laptop", 28000f));
            productsList.add(new Product(5, "Apple Laptop", 90000f));
    
            List<Float> productPriceList =
                    productsList.stream()
                            // filtering data
                            .filter(p -> p.price > 30000)
                            // fetching price by referring getPrice method
                            .map(Product::getPrice)
                            // collecting as list
                            .collect(Collectors.toList());
            System.out.println(productPriceList);
        }
    
    }

### Output:

[90000.0]

---
