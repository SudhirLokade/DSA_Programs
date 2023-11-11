package com.DSA;

import java.util.Scanner;

public class Recursion {
//     static int cnt = 0;
// static void name(){
//
//        if(cnt == 5){
//            return ;
//        }else {
//            System.out.println("Sudhir");
//            cnt++;
//            name();
//        }
//    }
//    public static void main(String[] args) {
//        name();
//    }
//}

//    static void name(int i, int n) {
//        if (i > n) {
//            return;
//        } else {
//            System.out.println("Sudhir");
//            name(i + 1, n);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n: ");
//        int n= sc.nextInt();
//
//        name(1, n);
//    }




    //Print linearly from 1 to N

    static void num(int i,int n){
        if(i<1 ){
            return;
        }else{
            System.out.println(i);
            num(i-1,n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int N = sc.nextInt();
        num(N,N);
    }
}



