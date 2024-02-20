# Java Function Interface
* It is a functional interface. 
* It is used to **refer method** by specifying **type of parameter**. 
* It **returns** a result back to the **referred function**.

## Java Function Interface Methods
| **Method**                                                                 | 	**Description**                                                                                                                                                                                                                                |
|----------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| default <V> Function<T,V> andThen(Function<? super R,? extends V> after)   | 	It returns a composed function that first applies this function to its input, and then applies the after function to the result. If evaluation of either function throws an exception, it is relayed to the caller of the composed function.   |
| static <T> Function<T,T> identity()                                        | 	It returns a function that always returns its input argument.                                                                                                                                                                                  |
| R apply(T t)                                                               | 	It applies this function to the given argument.                                                                                                                                                                                                |
| default <V> Function<V,R> compose(Function<? super V,? extends T> before)  | 	It Returns a composed function that first applies the before function to its input, and then applies this function to the result. If evaluation of either function throws an exception, it is relayed to the caller of the composed function.  |

### Java Function Interface Example 1

    package com.sourcecode.java8.functionalinterface.function;
    
    // importing Function interface
    
    import java.util.function.Function;
    
    public class FunctionInterfaceExample1 {
    
        static String show(String message) {
            return "Hello " + message;
        }
    
        public static void main(String[] args) {
            // Function interface referring to a method
            Function<String, String> fun = FunctionInterfaceExample1::show;
            // Calling Function interface method
            System.out.println(fun.apply("Peter"));
        }
    }
  
### Output:
Hello Peter

### Java Function Interface Example 2

    package com.sourcecode.java8.functionalinterface.function;
    
    import java.util.function.Function;
    import java.util.List;
    import java.util.ArrayList;
    
    public class FunctionInterfaceExample2 {
    
        static Integer addList(List<Integer> list) {
            return list.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
        }
    
        public static void main(String[] args) {
            // Creating a list and adding values
            List<Integer> list = new ArrayList<Integer>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            // Referring addList() method
            Function<List<Integer>, Integer> fun = FunctionInterfaceExample2::addList;
            // Calling Function interface method
            int result = fun.apply(list);
            System.out.println("Sum of list values: " + result);
        }
    }
  
### Output:

Sum of list values: 100

---


← PrevNext →