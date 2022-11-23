package com.aloex.SkyladderRace_pta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: ming
 * @date: 2022/5/23 14:58
 * @description:
 */
public class l111 {
    /*本题要求你计算A−B。不过麻烦的是，A和B都是字符串 —— 即从字符串A中把字符串B所包含的字符全删掉，剩下的字符组成的就是字符串A−B。

输入格式：
输入在2行中先后给出字符串A和B。两字符串的长度都不超过10
4
 ，并且保证每个字符串都是由可见的ASCII码和空白字符组成，最后以换行符结束。

输出格式：
在一行中打印出A−B的结果字符串。

输入样例：
I love GPLT!  It's a fun game!
aeiou
输出样例：
I lv GPLT!  It's  fn gm!*/

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));//相当于原来的Scanner sc = new Scanner(System.in);
        char[] s = bf.readLine().toCharArray();//bf.readLine() 相当于 sc.nextLine()
        char[] cs = new char[10000];
        int a = bf.read(cs);// 将字符串填入cs中，并且返回char数组长度
        int[] flag = new int[126];
        for (int i = 0; i < a; i++) {
            flag[cs[i]] = 1;
        }
        for (int i = 0; i < s.length; i++) {
            if (flag[s[i]] == 0) {
                System.out.print(s[i]);
            }
        }

    }
}
