package com.itheima.test.array;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        for(int s=0;s<arr.length;s++) {
            System.out.println(arr[s]);
        }
    }
}
