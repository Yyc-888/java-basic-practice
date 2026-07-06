package com.itheima.test.IfDemo;

import java.util.Scanner;

public class ifDemo1 {

    public static void main (String[] ards){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入外卖价格，饿了么全场9折优惠，美团满30-10");
        double price = sc.nextDouble();

        if(price>=30){

            if( price*0.9>price-10 ){
                System.out.println("饿了么价格为"+price*0.9);
                System.out.println("美团价格为"+(price-10));
                System.out.println("美团下单划算");
            }else{
                System.out.println("饿了么价格为"+price*0.9);
                System.out.println("美团价格为"+(price-10));
                System.out.println("饿了么下单划算");
            }

        } else if (price*0.9>price) {
            System.out.println("饿了么价格为"+price*0.9);
            System.out.println("美团价格为"+price);
            System.out.println("美团下单划算");

        }else{
            System.out.println("饿了么价格为"+price*0.9);
            System.out.println("美团价格为"+price);
            System.out.println("饿了么下单划算");
        }


    }

}
