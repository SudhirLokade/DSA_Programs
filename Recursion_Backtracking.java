package com.DSA;

//Backtracking recursion

import java.util.Scanner;

public class Recursion_Backtracking {
    static void num(int i, int n){
        if( i >n){
            return;
        }else{
            num(i+1,n);
            System.out.println(i);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int n= sc.nextInt();
        num(1,n);
    }
}
