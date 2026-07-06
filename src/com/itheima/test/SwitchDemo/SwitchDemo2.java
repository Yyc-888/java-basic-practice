package com.itheima.test.SwitchDemo;

public class SwitchDemo2 {
    public static void main(String[] args) {
        int num = 3;
        switch (num){
            case 1,2 -> System.out.println("星期一");
            case 3 -> System.out.println("星期三");
            default -> System.out.println("没有这个星期");

        }




    }
}
