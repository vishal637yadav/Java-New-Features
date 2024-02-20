## Java Predicate Interface
* It is a functional interface which represents a predicate (boolean-valued function) of one argument. 
* It is defined in the java.util.function package and contains test() a functional method.

## Java Predicate Interface Methods
| **Method**                                           | 	**Description**                                                                                                                                                                                                              |
|------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| boolean test(T t)                                    | 	It evaluates this predicate on the given argument.                                                                                                                                                                           |
| default Predicate<T> and(Predicate<? super T> other) | 	It returns a composed predicate that represents a short-circuiting logical AND of this predicate and another. When evaluating the composed predicate, if this predicate is false, then the other predicate is not evaluated. |
| default Predicate<T> negate()                        | 	It returns a predicate that represents the logical negation of this predicate.                                                                                                                                               |
| default Predicate<T> or(Predicate<? super T> other)  | 	It returns a composed predicate that represents a short-circuiting logical OR of this predicate and another. When evaluating the composed predicate, if this predicate is true, then the other predicate is not evaluated.   |
| static <T> Predicate<T> isEqual(Object targetRef)    | 	It returns a predicate that tests if two arguments are equal according to Objects.equals(Object, Object).                                                                                                                    |

### Java Predicate Interface Example 1

    package com.sourcecode.java8.functionalinterface.predicate;
    
    import java.util.function.Predicate;
    
    public class PredicateInterfaceExample1 {
    
        public static void main(String[] args) {
            Predicate<Integer> pr = a -> (a > 18); // Creating predicate
            System.out.println(pr.test(10));    // Calling Predicate method
        }
    
    }
  
### Output:

false

### Java Predicate Interface Example 2

    package com.sourcecode.java8.functionalinterface.predicate;
    
    import java.util.function.Predicate;
    
    public class PredicateInterfaceExample2 {
    
        static Boolean checkAge(int age) {
            return age > 17;
        }
    
        public static void main(String[] args) {
            // Using Predicate interface
            Predicate<Integer> predicate = PredicateInterfaceExample2::checkAge;
            // Calling Predicate method
            boolean result = predicate.test(25);
            System.out.println(result);
        }
    
    }
  
### Output:

true

---