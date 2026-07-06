package com.itheima.test.ForDemo;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Random r = new Random();
        int a = r.nextInt(-5,6);
        int count = 0;


        while(true){
            System.out.println("请输入数字：");
            Scanner  sc = new Scanner(System.in);
            int n = sc.nextInt();
            count++;

            if(count==3){
                System.out.println("已抽3次，触发小保底提示：范围为-5到+5之间");
            } else if (count>=10) {
                System.out.println("已抽10次，触发大保底：恭喜你猜中了");
                break;
            }
            if(n==a){
                System.out.println("恭喜你猜中了");
                break;
            }

        }





    }
}
