package com.aloex.SkyladderRace_pta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: 茗
 * @date: 2022/4/16 15:20
 * @description:
 */

public class l105 {
    /*
            * 输入样例：4        //输入几条数据，假定分类为ABC类型数
            * A数            B C
            3310120150912233 2 4
            3310120150912119 4 1
            3310120150912126 1 3
            3310120150912002 3 2
            2                    //查询个数
            3 4                  //要查询数的B编号
    * 输出样例：3310120150912002 2 //A和C
              3310120150912119 1
    */


    @SuppressWarnings({"all"})
    public static void main(String[] args) throws IOException {
//    int[][] ints;
//    ints = new int[][];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //可以将基本类型int转换为包装类型Integer,或者将String转换成Integer,String
        int n = Integer.valueOf(br.readLine());//4
        //s当做最后输出的数组  所以s中要带有A数和C数
        //因为没有0位所以n+1 下标为0的元素空着
        String[] s = new String[n + 1];
        for (int i = 0; i < n; i++) {
            //以循环第一次为例
            // 读取第一行数据 3310120150912233 2 4  ==> temp:["331012015091223...", "2", "4"]
            String[] temp = br.readLine().split(" ");//["331012015091223...", "2", "4"]
            //t1就是  2  转换成整型数
            int t1 = Integer.valueOf(temp[1]);
            //s: [null, null, "3310120150912233 4", null, null]
            s[t1] = temp[0] + " " + temp[2];
        }//最后循环完的 s: [null, "331012015091212 3", "331012015091223 4", "331012015091200 2", "331012015091211 1"]
        //n1是要查询的数据个数
        int n1 = Integer.valueOf(br.readLine());//2
        String[] temp = br.readLine().split(" ");//["3", "4"]
        for (int i = 0; i < n1; i++) {
            System.out.println(s[Integer.valueOf(temp[i])]);
        }

    }
}


