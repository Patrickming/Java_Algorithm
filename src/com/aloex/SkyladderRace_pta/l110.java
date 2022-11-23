package com.aloex.SkyladderRace_pta;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: ming
 * @date: 2022/5/23 14:57
 * @description:
 */

public class l110 {
    /*本题要求将输入的任意3个整数从小到大输出。

输入格式:
输入在一行中给出3个整数，其间以空格分隔。

输出格式:
在一行中将3个整数从小到大输出，其间以“->”相连。

输入样例:
4 2 8
输出样例:
2->4->8*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] res = sc.nextLine().split(" ");
        int[] ints = new int[3];
        for(int i = 0; i < 3;i++) {
            ints[i] = Integer.valueOf(res[i]);//一定要转换成int数组再排序，直接用String排序会出错
        }
        Arrays.sort(ints);
        System.out.println(ints[0] + "->" + ints[1] + "->" + ints[2]);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println( ( a < b ? a < c ? a : c < b ? c : b : b < c ? b : c ) +
        // "->" + ( a > b ? a > c ? b > c ? b : c : a : b > c ? a > c ? a : c : b ) +
        // "->" + ( a > b ? a > c ? a : c : b > c ? b : c ) );

    }


}
