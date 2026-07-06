package com.itheima.test.SwitchDemo;

public class SwitchDemo3 {
        public  static void main(String[] args) {

            int a = 10;
            int b = 20;
           String type = "-";
            int result = switch (type) {
                case "+" ->   a+b;
                case "-" ->  a-b;
                case "*" ->  a*b;
                case "/" ->  a/b;
                default ->  0;


           };

            System.out.println(result);

        }

}
