package com.itheima.test.array;

public class Test5 {
    public static  void  main(String[] args){

        int arr1[] = {1,3,5,7,9,20,30,40,50};
        int arr2[] = {1,2,4,6,8,10};
        int arr3[] = new int[arr1.length+arr2.length];

        int i = 0; // arr1的指针
        int j = 0; // arr2的指针
        int k = 0; // arr3的指针


        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        // 将arr2剩余元素复制到arr3
        while(j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        // 输出合并后的数组
        System.out.print("合并后的数组：");
        for(int m = 0; m < arr3.length; m++){
            System.out.print(arr3[m] + " ");
        }

    }
}
