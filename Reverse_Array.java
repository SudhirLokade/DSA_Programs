package com.DSA;

import java.util.Scanner;


public class Reverse_Array {
    static void reverse(int l, int r, int[] arr) {
        if (l >= r) {
            return;
        } else {
            swap(arr, l, r);
            reverse(l + 1, r - 1, arr);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int n = sc.nextInt();

        System.out.println("Enter array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(0, n - 1, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


//    static void reverse(int i, int arr[],int n){
//        if (i >= n/2) {
//            return ;
//        }else{
//            swap(arr, i, n - i - 1);
//            reverse(i+1,arr,n);
//        }
//    }
//
//    private static void swap(int arr[],int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter range: ");
//        int n = sc.nextInt();
//
//        System.out.println("Enter array: ");
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        reverse(0,arr,n);
//        for (int i= 0; i < n; i++) {
//            System.out.print(arr[i] +" ");
//        }
//    }
}