package com.DSA;

//Recursion on subsequence

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence_Recursion {
    static  void subse(int ind , ArrayList<Integer> current ,int [] arr,int n){
        if(ind >= n){
            System.out.println(current);
            return;
        }else{
//            Include the current element in the subsequence
            current.add(arr[ind]);
            subse(ind + 1,current,arr,n);

//            Exclude the current element in the subsequence
            current.remove(current.size() - 1);
            subse(ind + 1,current,arr,n);
        }
    }

    public static void main(String[] args) {

        //        Taking input from user
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
          int n = sc.nextInt();
        System.out.println("Enter array: ");
          int [] arr = new int[n];
          for(int i=0;i< n ;i++){
              arr[i] = sc.nextInt();
          }
            subse(0,new ArrayList<>(),arr,arr.length);
    }
}
