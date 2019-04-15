package com.juzss.binarysearch.sequential_search;

import java.util.Scanner;

/**
 * @Author Shinelon
 * @Description //TODO 顺序排序算法
 * @Date 0:59 2019/4/16
 * @Param
 * @return
 **/
public class SequelSearch {

    public static void main(String[] args) {
        int[] a = {1,6,8,4,88,66,99,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要找的数:");
        //存放控制台输入的语句
        int num = scanner.nextInt();
        //调用result方法,将返回值返回到result中
        int result = search(a, num);
        if(result == -1){
            System.out.println("你查找的数不存在");
        }else {
            System.out.println("你查找的索引位置在第" + result +"个");
        }

    }


    public static int search(int[] a,int num){

        for(int i = 0 ; i< a.length ; i ++){
            if(a[i] == num){
                //返回数据所在的下标
                return i;
            }
        }
        //如果不存在,返回-1
        return  -1;
    }
}



