package com.itheima.test.IfDemo;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x轴和y轴，将自动判断位置");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if(x>0 && y>0)  System.out.println("在第一象限");
        else if (x>0 && y<0)  System.out.println("在第四象限");
        else if (x<0 && y>0)  System.out.println("在第二象限");
        else if (x<0 && y<0)  System.out.println("在第三象限");
        else if (x==0 && y!=0) System.out.println("在y轴");
        else if (y==0 && x!=0) System.out.println("在x轴");
    else System.out.println("在原点");





    }
}
