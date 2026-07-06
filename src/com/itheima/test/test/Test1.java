package com.itheima.test.test;

public class Test1 {
    public static void main(String[] args){
        int slow = 0;
        int fast = 0;
        int arr[] = {0,1,2,2,3,0,4,2};
        int var = 2;

        while(fast < arr.length){
        if(arr[fast] != var){
            arr[slow] = arr[fast];
            slow++;

        }
        fast++;
        }

        for (int i = 0; i < slow; i++) {
            System.out.println(arr[i]);
        }




    }
}
