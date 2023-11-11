package com.DSA;


//Multiple Recursion call

import java.util.Scanner;

public class Multiple_Recursion {
    //Fibonacci Series
    static int fibo(int n){
        if(n <=1){
            return n;
        }else{
            int last = fibo(n-1);
            int slast = fibo(n-2);
            return last+ slast;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int  n = sc.nextInt();
        System.out.println(fibo(n));
    }


}
