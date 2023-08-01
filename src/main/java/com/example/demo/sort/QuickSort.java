package com.example.demo.sort;

public class QuickSort {

    public static void quickSort(int[] array, int l, int r){
        //边界条件，当最左大于等于最右下标的时候结束递归
        if (l >= r) return;
        //临时左指针i
        int i = l;
        //临时右指针j
        int j = r;
        //作为轴的值
        int pivot = array[l];
        //当前的坑，此位置暂时不存值，等待其他数填入
        int hole = l;

        //主循环体
        while (i < j){
            //从最右向左扫描，找到第一个比轴小的值
            while (i < j && array[j] >= pivot) j--;
            //将这个值设置到坑中
            array[hole] = array[j];
            //这个值的原位置成为新的坑
            hole = j;
            //从最左向右扫描，找到第一个比轴大的值
            while (i < j && array[i] <= pivot) i++;
            //将这个值设置到坑中
            array[hole] = array[i];
            //这个值的原位置成为新的坑
            hole = i;
        }
        //循环完毕，当前的坑就是轴的位置，所以将轴的值赋值到坑中
        array[hole] = pivot;
        //此时轴的左侧已经全部小于轴，右侧已经全部大于轴
        //递归排序轴左侧的数组
        quickSort(array, l, hole - 1);
        //递归排序轴右侧的数组
        quickSort(array, hole + 1, r);
    }

    public static void main(String[] args) {
        int[] array = {-150,60,10,40,50,20,30,50,90,0,30,100,-100};
        quickSort(array, 0, array.length-1);
        System.out.println(array.toString());
    }

}
