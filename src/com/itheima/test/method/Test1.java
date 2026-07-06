package com.itheima.test.method;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){

        int arr[]= new int[5];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int total = 0;
        for( i=0; i<arr.length; i++){
            System.out.println("请输入第"+(i+1)+"个分数：");
            arr[i] = sc.nextInt();


            if(arr[i]>100||arr[i]<0){
                System.out.println("输入的数字有误,请重新打分");
                i--;
            }else {
                total = total + arr[i];
            }

        }

        int zui = (total-getmax(arr)-getmin(arr) )/3;
        System.out.println("最终得分为："+zui);




    }

    public static int getmax(int arr[]){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }

        return max;
    }
    public static int getmin(int arr[]){
        int min = arr[0];
        for (int i=1; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

}
