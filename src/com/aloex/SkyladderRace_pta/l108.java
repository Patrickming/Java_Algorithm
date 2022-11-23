package com.aloex.SkyladderRace_pta;

import java.util.Scanner;

/**
 * @author: ming
 * @date: 2022/5/16 17:03
 * @description:
 */
public class l108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = 0;
        int sum = 0;
        for (; a <= b; a++) {
            sum += a;
//            System.out.print(a + " ");
            System.out.printf("%5d", a);
            num++;
            //控制换行
            if (num % 5 == 0) {
                System.out.println();
            }
        }
        //这里的情况是上面刚刚好是5的倍数已经换过一次行，就不用重复换行了
        if (num % 5 != 0) {
            System.out.println();
        }
        System.out.println("Sum = " + sum);

    }
}