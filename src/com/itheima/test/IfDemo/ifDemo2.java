package com.itheima.test.IfDemo;

import java.util.Scanner;

public class ifDemo2 {
    public  static  void  main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        if(num1%2==0){
            num1=num1/2;

        }else{
            num1=num1*3+1;
        }
        System.out.println(num1);

    }
}
