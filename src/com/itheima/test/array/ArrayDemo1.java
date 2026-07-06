package com.itheima.test.array;

public class ArrayDemo1 {
    public static void main(String[] args){
        int arr2[] = new int[]{12,11,14};
        int arr1[] = {18, 19, 20};
        System.out.println(arr1[0]);
        arr1[0] = 100;
        int num = arr1[0];
        System.out.println(num);
        System.out.println(arr1[0]);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }

        System.out.println(arr1.length);












    }
}
