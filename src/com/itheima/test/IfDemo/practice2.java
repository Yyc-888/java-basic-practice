package com.itheima.test.IfDemo;

import java.util.Scanner;

public class practice2 {
    public  static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高(米):");
        double height = sc.nextDouble();
        System.out.println("请输入体重(kg):");
        double weight = sc.nextDouble();
        double bmi = weight/(height*height);
        System.out.println("BMI指数为："+bmi);
        if(bmi<18.5) System.out.println("身材：消瘦。健康风险：部分增加。");
        else if(bmi<=23.9) System.out.println("身材：正常。健康风险：正常。");
        else if(bmi<=26.9) System.out.println("身材：偏胖。健康风险：增加。");
        else if(bmi<=29.9) System.out.println("身材：肥胖。健康风险：中度增加。");
        else  System.out.println("身材：严重肥胖。健康风险：严重增加。");
    }
}
