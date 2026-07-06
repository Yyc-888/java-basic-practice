package com.itheima.test.method;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入快递重量(kg)：");
        double weight = sc.nextDouble();
        while(weight<=0){
            System.out.println("请输入正确的重量：");
            weight = sc.nextDouble();
        }
        System.out.println("输入的重量是："+weight+"kg");


        if(weight<=1){
            System.out.println("运费价格是："+price1(weight)+"元");
        } else if (weight<=5) {
            System.out.println("运费价格是："+price2(weight)+"元");
        }else {
            System.out.println("运费价格是："+price3(weight)+"元");
        }

    }

    public static double price1(double weight){
        double price1 = 10;
        return price1;
    }

    public static double price2(double weight){
        double price2 = 10+(weight-1)*2;
        return price2;
    }

    public static double price3(double weight){
        double price3 = 10+8+(weight-5)*1.5;
        return price3;
    }

}
