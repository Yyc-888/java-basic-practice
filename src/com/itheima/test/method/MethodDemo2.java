package com.itheima.test.method;

public class MethodDemo2 {
    public static void main(String[] args) {
        biao();
    }

    public static void biao(){

        for(int i = 1; i < 10; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+ "*" +i +"=" + i*j +"  ");
            }
            System.out.println("\n");
        }
        System.out.println("* * * * * * * *");

    }

}
