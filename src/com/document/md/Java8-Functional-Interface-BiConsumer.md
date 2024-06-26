# Java BiConsumer Interface
* **BiConsumer Interface** _accepts_ **two input arguments** and **does not return any result**. 
* This is the two-arity specialization of Consumer interface. 
* It provides a functional method accept(Object, Object) to perform custom operations.

## Java BiConsumer Interface Methods
| Method                                                                                                                                                                                                                                                                                                                                                                                      | 	Description                                                                                                                                                                                                                                                                                                          |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| void accept(T t, U u)                                                                                                                                                                                                                                                                                                                                                                       | 	It performs this operation on the given arguments.                                                                                                                                                                                                                                                                   |
| default BiConsumer<T,U> andThen(BiConsumer<? super T,? super U> after)| 	It returns a composed BiConsumer that performs, in sequence, this operation followed by the after operation. If performing either operation throws an exception, it is relayed to the caller of the composed operation. If performing this operation throws an exception, the after operation will not be performed. |

## Java BiConsumer Interface Example 1
    package com.sourcecode.java8.functionalinterface.biconsumer;
    
    import java.util.function.BiConsumer;
    
    public class BiConsumerExample1 {
    
        static void ShowDetails(String name, Integer age) {
            System.out.println(name + " " + age);
        }
    
        public static void main(String[] args) {
            // Referring method
            BiConsumer<String, Integer> biCon = BiConsumerExample1::ShowDetails;
            biCon.accept("Rama", 20);
            biCon.accept("Shyam", 25);
            // Using lambda expression
            BiConsumer<String, Integer> biCon2 = (name, age) -> System.out.println(name + " " + age);
            biCon2.accept("Peter", 28);
        }
    
    }
  
## Output:

Rama 20<br>
Shyam 25<br>
Peter 28<br>

## Java BiConsumer Interface Example 2

    package com.sourcecode.java8.functionalinterface.biconsumer;
    
    import java.util.function.BiConsumer;
    import java.util.HashMap;
    import java.util.Map;
    
    public class BiConsumerInterfaceExample2 {
    
        static void ShowDetails(Map<Integer, String> map, String mapName) {
            System.out.println("----------" + mapName + " records-----------");
            map.forEach((key, val) -> System.out.println(key + " " + val));
        }
    
        public static void main(String[] args) {
            Map<Integer, String> map = new HashMap<Integer, String>();
            map.put(100, "Mohan");
            map.put(110, "Sujeet");
            map.put(115, "Tom");
            map.put(120, "Danish");
            // Referring method
            BiConsumer<Map<Integer, String>, String> biCon = BiConsumerInterfaceExample2::ShowDetails;
            biCon.accept(map, "Student");
        }
    
    }
 
### Output:

----------Student records-----------<br>
115 Tom<br>
100 Mohan<br>
120 Danish<br>
110 Sujeet<br>


