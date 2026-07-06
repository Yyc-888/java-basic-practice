package com.itheima.test.array;

public class Test6 {
    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 6};
        int target = 5;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println(i);
                break;
            } else if (arr[i] >= target) {


                System.out.println(i);
                break;
            }

            while(i==arr.length-1){
                System.out.println(i+1);
                break;
            }

        }

    }
}