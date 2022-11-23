package com.aloex.SkyladderRace_pta;

import java.util.Scanner;

/**
 * @author: ming
 * @date: 2022/5/23 15:00
 * @description:
 */
public class l113 {
    //    对于给定的正整数N，需要你计算 S=1!+2!+3!+...+N!。
//
//    输入格式：
//    输入在一行中给出一个不超过10的正整数N。
//
//    输出格式：
//    在一行中输出S的值。
//
//    输入样例：
//            3
//    输出样例：
//            9
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += f(i);
        }
        System.out.println(sum);

    }

    public static int f(int a) {
        if (a == 1) {
            return 1;
        }
        return a * f(a - 1);
    }
}
