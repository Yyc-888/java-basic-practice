package com.itheima.test.array;

import java.util.Random;

public class Test3 {
    public static void main(String[] args){

        Random r = new Random();


        int[] arr = new int[10];

        for (int i=0; i<arr.length; i++){

           int  num = r.nextInt(0,101);
            int count = 0;
            for(int j=0; j<i; j++) {
               if(num==arr[j]){
                   count++;
                   i--;
                   break;
               }
            }

            if(count==0) {
                arr[i] = num;
            }


        }

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
