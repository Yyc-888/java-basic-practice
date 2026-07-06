package com.itheima.test.ForDemo;

import java.util.Scanner;

public class ForDemo2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("输入：");
        int i = sc.nextInt();
    int a = 1;
    System.out.println("输出：");
        for( a =1;a<=i&&a>=0;a++){
            if(a%4==0||a/10==4||a%10==4){
                continue;
            }

            System.out.println(a);
        }


    }
}
