# DSA_Programs on Recursion
This programs are used to show the all recursion methods
- Simple Recursion
- Backtracking Recursion
- Multiple Recursion
- Reverse array
- Subsequences Recursion
- Sum of Subsequences
- Count Subsequences
- Pallindrome String
- Combination Sum
  

# Recursion
 To check simple recursion click on this: [Simple Recursion](https://github.com/SudhirLokade/DSA_Programs/blob/main/Recursion.java)
 - Simple recursion is performed
 - Printed a name/number for n number of times

# Recursion Backtracking
To check backtracking recursion click on this: [Backtracking recursion](https://github.com/SudhirLokade/DSA_Programs/blob/main/Recursion_Backtracking.java)
- Printing numbers from n to 1 using backtracking
- It approches the given task in the some different way like by changing base conditions
  # Backtracking
  - Choice: Make a decision to try a particular option.
  - Explore: Explore all possibilities associated with that decision.
  - Constraint: Check if the current combination of choices satisfies the problem constraints.
  - Backtrack: If the current combination does not satisfy the constraints, undo the last decision and try a different one.
# Multiple Recursion 
- Multiple recursion refers to a situation in which a function calls itself more than once during its execution. 
- The function exhibits recursive behavior, and at each recursive step, it makes multiple calls to itself.
- The best example of multiple recursion is fibonacci series
- Here is sample code for fibonacci function
  ```java
        public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
  ```
  - To check multiple recursion click on this: [Multiple Recursion](https://github.com/SudhirLokade/DSA_Programs/blob/main/Multiple_Recursion.java)
# Reverse Array 
- It reverse the given array
- To check the reverse array click on this: [Reverse array](https://github.com/SudhirLokade/DSA_Programs/blob/main/Reverse_Array.java)

# Subsequences Recursion 
- It prints all the possible subsequences of an array
   # What is subsequences
   - A contiguous/non-contiguous sequences,which follws the order
- To check the sunsequences recursion click on this: [Subsequences Recursion](https://github.com/SudhirLokade/DSA_Programs/blob/main/Subsequence_Recursion.java)

# Sum of Subsequences 
- The sum of subsequences typically involves finding the sum of all possible combinations of elements from the array
- It considers both contiguous and non-contiguous subsequences
- To check the sum of subsequences click on this: [Sum of Subsequences](https://github.com/SudhirLokade/DSA_Programs/blob/main/Sum_of_Subsequences.java)

# Count Subsequnces 
- It count the sunsequences that sum up to given number from the array
- For example:- Array is [1,2,3,4,5] and sum is 10 then output will be 3.Because there aree 3 subsequneces that sum to 10
    # Usage
  - To use this code
      1. Compile the  java file.
         
          `` javac count_Subsequences.java ``
      3. Run the program
- To check the count Subsequences click on this: [Count Subsequences](https://github.com/SudhirLokade/DSA_Recursion_Programs/blob/main/count_Subsequences.java)

# Combination Sum 
- This Java code generates all combinations of elements from a given array that sum up to a specified target.
    # Usage
  - To use this code:

    1. Compile the Java file.
    2. Run the compiled Java class.
    3. Enter the range (number of elements in the array), target sum, and the array elements when prompted.
  
 
