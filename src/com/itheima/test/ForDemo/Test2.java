package com.itheima.test.ForDemo;

public class Test2 {
    public static void main(String[] args){

        //写出一个10之内的乘法口诀表
        int a = 1;
        int b = 0;
        for(int i = 1; i <= 9; i++){

            for(a=1; a<=i; a++) {
                b = a*i;
                System.out.print(a + "*" + i + "=" + b+"\t");

            }
            System.out.print("\n");
        }


    }
}
