package com.itheima.test.IfDemo;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个数：");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(a+b>c&&a+c>b&&b+c>a){

            if(a==b && b==c){
                System.out.println("等边三角形");
            } else if ( (a==b && a!=c) || (a==c&&a!=b)|| (b==c&&b!=a) ) {
                System.out.println("等腰三角形");
            } else if ((a*a)+(b*b)==(c*c)||(a*a)+(c*c)==(b*b)||(b*b)+(c*c)==(a*a)) {
                System.out.println("直角三角形");
            }else{
                System.out.println("普通三角形");
            }

        }else {
            System.out.println("无法构成三角形");
        }


    }
}
