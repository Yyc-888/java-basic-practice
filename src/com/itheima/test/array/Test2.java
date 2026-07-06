package com.itheima.test.array;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {

        Random r = new Random();
        int arr[] = {10,20,30,40,50};

        for(int i=0; i<arr.length; i++){
            int random = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i]= arr[random];
            arr[random] = temp;

        }


        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
