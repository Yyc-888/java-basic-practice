package com.itheima.test.method;

import java.util.Scanner;

public class Test2 {
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i =0; i<10; i++){
            System.out.println("请输入第"+(i+1)+"位同学的分:");
            arr[i] = sc.nextInt();
            if(arr[i]>100||arr[i]<0){
                System.out.println("成绩无效，请重新输入。");
                i--;
            }

        }

        double jigel = jige(arr)/10.0;
        System.out.println("及格人数为："+jige(arr));
        System.out.println("及格率为："+jigel*100+"%");

        System.out.println("总分为："+total(arr));
        System.out.println("平均分为："+total(arr)/10.0);

        System.out.println("最大值为："+max(arr));

    }

    //及格人数
    public static int jige(int arr[]){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>=60){
                count++;
            }
        }
        return count;
    }

    //求总分
    public static int total(int arr[]){
        int total = 0;
        for (int i = 0; i <10 ; i++) {
            total=total+arr[i];
        }
        return total;
    }
    //求最大值
    public static int max(int arr[]){
        int max = 0;
        for (int i = 0; i < 10; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        
        return max;
    }

}
