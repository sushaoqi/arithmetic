package com.juzss.binarysearch;

import java.util.Scanner;

/**
 * CLassName  binarySearch
 * Description TODO 二分查找
 *
 * @Author Shinelon
 * @Date 2019/4/16 1:21
 * @Version 1.0
 **/
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 1, 9, 8, 2, 4, 7};
        System.out.println("原始数组如下:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        for(int i = 0; i < arr.length - 1; i ++){
            for(int j = 0; j <  arr.length - 1 -i;  j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("经过冒泡排序后的数组:");
        for(int n : arr){
            System.out.print(n+" ");
        }
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("你要查找的数是:");
        int num = input.nextInt();
        int result = binarySearch(arr, num);
        if(result == -1){
            System.out.println("你要查找的数不存在");
        }else{
            System.out.println("你要查找的数存在,在数组的第"+result);
        }

    }


    public static int binarySearch(int[] arr,int num){
        int low = 0;
        int  big = arr.length - 1;
        while (low <= big){
            int mid = (low + big) / 2;
            if(arr[mid] < num){
                low = mid + 1;
            }else if(arr[mid] > num){
                big = mid - 1;
            }else{
                return mid;
            }
        }
        return  -1 ;
    }
}
