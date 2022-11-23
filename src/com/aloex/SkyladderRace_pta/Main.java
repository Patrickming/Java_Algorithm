package com.aloex.SkyladderRace_pta;

import java.util.Scanner;


/**
 * @author: 茗
 * @date: 2022/4/16 15:12
 * @description:
 */

/*不卡时间的连续因子*/

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;// 如果字符串里加了数字就改为false
        int k = 2, x = 0;
        int N = (int) Math.sqrt(n);//25
        String str[] = new String[N];// 存，每个数字作为起始因子对应的答案
        while (x < N) {// 循环到N-1 为止   24
            int a = n, tk = k;
            boolean b = true;// 处理答案中多一个*号的问题
            str[x] = "";
            while (a % tk == 0) {// 整除则继续

                a /= tk;
                if (b) {
                    flag = false;
                    b = false;
                    str[x] += tk;
                    tk++;
                    continue;
                }
                str[x] += "*" + tk;
                tk++;
            }
            k++;
            x++;
        }
        int maxi = 0;
        for (int i = 1; i < str.length; i++) {
            if (str[i].equals("")) {
                continue;
            }
            if (str[maxi].equals("")) {
                maxi = i;
                continue;
            }
            maxi = str[maxi].split("\\*").length >= str[i].split("\\*").length ? maxi : i;// 找最长答案对应的下标
        }
        if (flag) {// 排除质数的情况
            System.out.println("1");
            System.out.println(n);
        } else {
            System.out.println(str[maxi].split("\\*").length);
            System.out.println(str[maxi]);
        }

    }

}
