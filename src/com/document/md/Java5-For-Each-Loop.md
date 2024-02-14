# Java For-each Loop | Enhanced For Loop
* Introduced since **J2SE 5.0**. 
* Known as the **for-each loop** because it **traverses each element** _one by one_.
* It provides an **alternative approach** _to traverse_ the **array or collection** in Java. 
 
# Advantage of the for-each loop : 
* It **eliminates** the **possibility of bugs** and **makes the code more readable**.
* It **eliminates the possibility** of **programming errors**.

# Drawback of the enhanced for loop : 
* It **cannot traverse** the elements **in reverse order**. 
* It **does not** have the option to **skip any element** _because_ it does **not work** on an **index basis**. 
* It **cannot traverse depending upon indexes** like you cannot traverse the odd or even elements only.

> [!NOTE]
> It is **recommended** to use the Java for-each loop for **traversing** the **elements** of **array** and **collection**
because it **makes the code readable**.


## Syntax
The syntax of Java for-each loop consists of **data_type** with the variable followed by a **colon (:)**, 
then **array or collection**.

    for(data_type variable : array | collection) {  
        //body of for-each loop  
    }  


# How it works?
The Java for-each loop traverses the array or collection until the last element. 
For each element, it stores the element in the variable and executes the body of the for-each loop.

## For-each loop Example: Traversing the array elements
    package com.sourcecode.java5.enhancedforloop;
    
    public class ForEachExample1 {
    
        public static void main(String args[]) {
            //declaring an array
            int arr[] = {12, 13, 14, 44};
            //traversing the array with for-each loop
            for (int i : arr) {
                System.out.println(i);
            }
        }
    }


### **Output:**

12
12
14
44

Let us see another of Java for-each loop where we are going to total the elements.
## Java for-each loop : Example2 :Calculating total sum of the elements in array

    package com.sourcecode.java5.enhancedforloop;
    
    public class ForEachExample2 {
    
        public static void main(String args[]) {
            int arr[] = {12, 13, 14, 44};
    
            int total = 0;
            for (int i : arr) {
                total = total + i;
            }
            System.out.println("Total: " + total);
        }
    }

### Output:
**Total: 83**

---

## For-each loop Example 3: Traversing the collection elements
    package com.sourcecode.java5.enhancedforloop;
    
    import java.util.ArrayList;
    
    public class ForEachExample3 {
    
        public static void main(String[] args) {
            //Creating a list of elements
            ArrayList<String> list = new ArrayList<>();
            list.add("vimal");
            list.add("sonoo");
            list.add("ratan");
            //traversing the list of elements using for-each loop
            for (String s : list) {
                System.out.println(s);
            }
    
        }
    
    }

  
### Output:
vimal
sonoo
ratan

