package com.aloex.SkyladderRace_pta;

import java.util.Scanner;

/**
 * @author: 茗
 * @date: 2022/5/16 16:42
 * @description:
 */
public class l107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //对应数字拼音表
        String[] arr = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        //少循环一次有空格的
        for (int i = 0; i < s.length() - 1; i++) {
            //判断是否为数字0~9
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                System.out.print(arr[s.charAt(i) - '0'] + " ");
            } else {
                System.out.print("fu ");
            }
        }
        //输出最后一个数（不带空格）
        System.out.print(arr[s.charAt(s.length() - 1) - '0']);
    }

}
