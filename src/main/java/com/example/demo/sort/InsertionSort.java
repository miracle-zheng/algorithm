package com.example.demo.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array){
        //第一层循环，从数组中第二位开始，因为第一位只有一个数，可以认为有序
        for (int i = 1; i < array.length; i++){
            //暂存当前要排序的值
            int key = array[i];
            //设置有序序列的最大值
            int j = i - 1;
            //第二层循环，找当前要排序的值在有序序列中的位置
            for (; j >= 0; j--){
                //如果有序序列中比当前值要大，就往后挪一位，反之直接break，证明找到了当前要排序的值的位置
                if (array[j] > key){
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            //j指针当前位置就是需要插入当前值的位置
            array[j + 1] = key;
        }
    }



    public static void main(String[] args) {
        int[] array = {-150,60,10,40,50,20,30,50,90,0,30,100,-100};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
