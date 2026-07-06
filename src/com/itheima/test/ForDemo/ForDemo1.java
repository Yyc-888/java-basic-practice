package com.itheima.test.ForDemo;

import java.util.Scanner;

public class ForDemo1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("输入：");
        int i = sc.nextInt();


        while (i<=100000&&i>=0){
            if(i%4==0||i%10==4||i/10==4){
                i++;
            }else {

                System.out.println("输出：" + i);
                i++;
            }
        }



    }
}
