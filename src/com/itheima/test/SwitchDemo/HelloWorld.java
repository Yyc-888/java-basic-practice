package com.itheima.test.SwitchDemo;


import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("-----游戏规则-----");
        System.out.println("-----角色初始生命值200-----");
        System.out.println("-----血量最低为1，最高为200-----");
        int mood = 200;


        System.out.println("请输入造成的伤害");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        mood = mood - num1;
        if (num1>199){
            mood = 1;
        }

        System.out.println("剩余生命值为"+mood);


        System.out.println("请输入技能回血量");
        int num2 = sc.nextInt();
        mood = mood + num2;
        if(mood>200){
            mood = 200;
        }
        System.out.println("最终血量为："+mood);
        System.out.println("游戏结束");


    }

}
