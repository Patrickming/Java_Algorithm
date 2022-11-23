package com.aloex.SkyladderRace_pta;

import java.util.Scanner;

/**
 * @author: 茗
 * @date: 2022/4/16 15:12
 * @description:
 */
public class l102 {
    //*****
    // ***
    //  *
    // ***
    //*****

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入你给多少个符号
        int giveNum = scanner.nextInt();
        //设定的符号
        String sign = scanner.next();
        //初始第一行用掉的符号数
        int s = 1;
        //初始用掉的符号数
        int a = s;
        //h行数(上半部分包括中心部分)
        int ss = 0, n = 0, h = 0;
        while (a <= giveNum) {
            /*判断数：s  a
            * 输出数：ss n h*/
            //当前一行用掉的符号数(也代表完整沙漏最大一行的符号数)
            ss = s;
            //下次一行用掉的符号数
            s += 2;
            //当前用掉的符号总数
            n = a;
            //下次用掉的符号总数
            a += 2 * s;
            h++;
        }
        //计算余数
        int yu = giveNum - n;
        String[] str = new String[h];//用数组存每行的*号是因为，图像是对称的，打印下半部分可以直接用

        /*打印上半部分*/
        for (int i = 0; i < h; i++) {
            str[i] = "";//数组初始化，不然默认是null在图像里
        }
        for (int i = 0; i < h; i++) {
            //打印空格,第几行就要几个空格（递增）
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //5,3,1  2n-1  n=（h-i）
            for (int k = 0; k < (h - i) * 2 - 1; k++) {// 储存*
                str[i] += sign;//字符串拼接
            }
            System.out.println(str[i]);
        }
        /*打印下半部分*/
        //下半部分要比上半部分少打印一次所以i=1
        for (int i = 1; i < h; i++) {
            //下半部分有几行就对应几个空格（递减）
            //第一行要一个h-2
            //h-1-i就是倒着来找的
            for (int j = h - 1 - i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println(str[h - 1 - i]);
        }
        System.out.println(yu);

    }
}
