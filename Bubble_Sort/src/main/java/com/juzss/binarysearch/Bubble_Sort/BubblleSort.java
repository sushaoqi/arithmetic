package com.juzss.binarysearch.Bubble_Sort;

/**
 * CLassName  BubblleSort
 * Description TODO 冒泡排序
 *
 * @Author Shinelon
 * @Date 2019/4/15 23:14
 * @Version 1.0
 **/
public class BubblleSort {


    public static void main(String[] args) {
        int[] arr = {6,3,8,2,9,1};
        System.out.println("排序前的数组:");
        for(int num : arr){
            System.out.print(num + " ");
        }

        //外部排序控制排序的趟数
        for(int i = 0; i < arr.length - 1;i++){
            //内部排序控制排序的趟数的次数
            for(int j = 0; j < arr.length - 1 - i; j++){
                  if(arr[j] > arr[j + 1]){
                      int temp = arr[j];
                      arr[j] = arr[j + 1];
                      arr[j + 1] = temp;
                  }

            }
        }

        System.out.println();
        System.out.println("排序后的数组:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
