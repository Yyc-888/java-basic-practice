package com.itheima.test.test;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {


        int m = 20000;
        int n = 5;

        Random r = new Random();
        if (m < 4) {
            System.out.println("金额不够，请重新输入红包金额：");
        }else{
            for (int i = 0; i < 4; i++) {
                int mym = r.nextInt(m - (n-i))+1;
                m=m-mym;
                System.out.println("第"+i+"个人抢到金额为："+mym/100.0+"元");
            }

            System.out.println("第"+n+"个人抢到金额为："+m/100.0+"元");
        }

    }
}
