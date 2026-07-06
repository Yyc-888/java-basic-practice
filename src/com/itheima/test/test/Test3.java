package com.itheima.test.test;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[7];
        int arr2[] = new int[7];

//----------------------------------------------------------------------------------------

        for (int i = 0; i < 5 ; ) {
            int num = r.nextInt(1,36);
            if(contains(num,arr1,0,5) ){

                continue;
            }else {
                arr1[i] = num;
            }
            i++;
        }

        for (int i = 5; i < 7 ; ) {
            int num = r.nextInt(1,13);
            if(contains(num,arr1,5,7) ){

                continue;
            }else {
                arr1[i] = num;
            }
            i++;
        }

//---------------------------------------------------------------------------------------------

        for(int i = 0; i < 5; ) {
            System.out.println("请输入第"+(i+1)+"个数字：");
            int num1 = sc.nextInt();
            if(num1<1||num1>36){
                System.out.println("输入的数字有误,请重新输入号码。");
                continue;
            }else if(contains(num1,arr2,0,5)){
                System.out.println("输入的数字不能重复,请重新输入号码。");
            }else {
                arr2[i] = num1;
                i++;
            }
        }

        for(int i = 5; i < 7; ) {
            System.out.println("请输入第"+(i+1)+"个数字：");
            int num1 = sc.nextInt();
            if(num1<1||num1>12){
                System.out.println("输入的数字有误,请重新输入号码。");
                continue;
            }else if(contains(num1,arr2,5,7)){
                System.out.println("输入的数字不能重复,请重新输入号码。");
            }else {
                arr2[i] = num1;
                i++;
            }
        }

        System.out.print("您输入的号码是：");
        for (int i = 0; i < 7; i++) {
            System.out.print(arr2[i]+" ");
        }

        System.out.print("开奖号码为：");
        for (int i = 0; i < 7; i++) {
            System.out.print(arr1[i]+" ");
        }


        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < 5; i++) {
            if(contains(arr2[i],arr1,0,5)){
                count1++;
            }
        }
        System.out.println("前面中奖的数字有"+count1+"个");
        for (int i = 5; i < 7; i++) {
            if(contains(arr2[i],arr1,5,7)){
                count2++;
            }
        }
        System.out.println("后面中奖的数字有"+count2+"个");


        if(count1 == 5&&count2 == 2){
            System.out.println("恭喜你，中了一等奖！");
        } else if (count1 == 5&&count2 == 1) {
            System.out.println("恭喜你，中了二等奖！");
        } else if (count1 == 5&&count2 == 0||count1 == 4&&count2 == 2) {
            System.out.println("恭喜你，中了三等奖！");
        } else if (count1 == 4&count2 == 1||count1 == 3&&count2 == 2) {
            System.out.println("恭喜你，中了四等奖！");
        } else if (count1 == 4&&count2 == 0||count1 == 3&&count2 == 1||count1 == 2&&count2 == 2) {
            System.out.println("恭喜你，中了五等奖！");
        } else if (count1 == 3&&count2 == 0||count1 == 1&&count2 == 2||count1 == 2&&count2 == 1||count1 == 0&&count2 == 2) {
            System.out.println("恭喜你，中了六等奖！");
        }else {
            System.out.println("没有中奖");
        }
    }
//---------------------------------------------------------------------------------------
//判断是否相同
    public static boolean contains(int num,int arr1[],int began,int end){
        for(int i = began; i < end; i++){
            if(arr1[i] == num){
                return true;
            }

        }
            return false;
    }

}
