package com.example.demo.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void bubbleSort(int[] array){
        //第一层循环，循环length-1次
        for (int i = 0; i < array.length - 1; i++){
            //第二层循环，每次循环都将一个最大的数冒泡到最后
            for (int j = 0; j < array.length - i - 1; j++){
                //如果当前比后一个数要大，则交换
                if (array[j] > array[j+1]){
                    //交换
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] array = {60,10,40,50,20,30,50,90,0,30,100};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
