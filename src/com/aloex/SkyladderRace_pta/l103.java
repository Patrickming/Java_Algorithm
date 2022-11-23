package com.aloex.SkyladderRace_pta;


import java.util.Scanner;

/**
 * @author: 茗
 * @date: 2022/4/25 20:18
 * @description:
 */
public class l103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //toCharArray将字符串转换为字符数组。
        char[] chars = scanner.nextLine().toCharArray();
        //ints作为一个计数器看一个数出现了多少次
        //一共十个数字
        int[] ints = new int[10];
        for (int i = 0; i < chars.length; i++) {
            //意思是ints[i]的数值加一（计数）  , 减一个字符0就相当于转换成int类型
            //例：‘110001’
            //i = 0 chars[0] = 1   ints[1] = 1;
            //i = 1 chars[1] = 1   ints[1] = 2;
            //i = 2 chars[2] = 0   ints[0] = 1;
            //.....以此类推计数
            ints[chars[i] - '0']++;
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 0) {
                System.out.println(i + ":" + ints[i]);
            }
        }
    }
}
