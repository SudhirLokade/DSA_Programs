package com.DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_of_Subsequences {
    static void sum(int ind, ArrayList<Integer> ds, int[] arr, int s, int n, int sm) {
        if (s == sm) {
            System.out.println(ds);
            return;
        } else if (ind == n) {
            return;
        } else {
            ds.add(arr[ind]);

//            pick condition
            sum(ind + 1, ds, arr, s + arr[ind], n, sm);
            ds.remove(ds.size() - 1);

//            Not pick condition
            sum(ind + 1, ds, arr, s, n, sm);
        }

    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter range: ");
            int n = sc.nextInt();
            System.out.println("Enter array: ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter sum you want: ");
            int sm = sc.nextInt();
            int s = 0;
            sum(0, new ArrayList<>(), arr, s,n, sm);
        }
    }

