package com.juzss.binarysearch.selection_sort;

/**
 * CLassName  SelectionSort
 * Description TODO 简单快速排序
 *
 * @Author Shinelon
 * @Date 2019/4/15 23:58
 * @Version 1.0
 **/
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1,3,2,44,69,33,12};
        System.out.print("交换之前: ");
        for(int num : arr){
            System.out.print(num + " ");
        }

        //快速排序

        //做n躺循环
        for(int i = 0; i<  arr.length ; i ++){
            int k = i ;
            //记录最小记录
            for(int j = k + 1 ; j < arr.length ; j++){
                if(arr[j] < arr[k]){
                    //记录下最小值的位置
                    k = j;
                }
            }

            if(i != k){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        System.out.println();
        System.out.print("交换之后: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

}
