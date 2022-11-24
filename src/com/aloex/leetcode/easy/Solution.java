package com.aloex.leetcode.easy;


/**
 * @author: xrm
 * @date: 2022/11/23 17:39
 * @description:
 */



class Solution {
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}
