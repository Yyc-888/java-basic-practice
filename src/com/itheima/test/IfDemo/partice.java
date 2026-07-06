package com.itheima.test.IfDemo;

import java.util.Scanner;

public class partice {
            public static  void main (String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("请输入充值金额");
                double price = sc.nextDouble();
                if(price<1000) System.out.println("充值成功，目前余额为："+ price);
                  else if (price<2000) System.out.println("充值成功，目前余额为："+ (price+200));
                  else if (price<3000) System.out.println("充值成功，目前余额为："+ (price+500));
                  else if (price<5000) System.out.println("充值成功，目前余额为："+ (price+700));
                  else if (price<10000) System.out.println("充值成功，目前余额为："+ (price+1300));
                  else if (price<20000) System.out.println("充值成功，目前余额为："+ (price+2500));
                  else if (price<50000) System.out.println("充值成功，目前余额为："+ (price+6000));
                  else System.out.println("充值成功，目前余额为："+ (price+15000));

            }
}

