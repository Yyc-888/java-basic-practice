package com.itheima.test.method;

public class MethodDemo1 {
    public static void main(String[] args) {


        int A = getsum(10,20);
        System.out.println(A);

    }

    public static int getsum ( int a, int b ) {

        int sum = a+b;
        return sum;
    }


}
