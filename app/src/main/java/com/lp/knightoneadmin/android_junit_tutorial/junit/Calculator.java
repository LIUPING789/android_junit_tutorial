package com.lp.knightoneadmin.android_junit_tutorial.junit;

import java.io.Serializable;

/** 
 * Create By Time:2016-7-2 
 * @author knightoneadmin 
 * @e-mail: 37442216knight@gmail.com 
 * @describe: Calculator 计算器 
 */
public class Calculator implements Serializable {
    /**
     * @param one
     * @param another
     * @return
     */
    public int add(int one, int another) {
        return one + another;
    }
    /**
     *
     * @param one
     * @param another
     * @return
     */
    public int multiply(int one, int another) {
        // 为了简单起见，暂不考虑溢出等情况。
        return one * another;
    }

    /**
     *
     * @param divident
     * @param dividor
     * @return
     */
    public double divide(double divident, double dividor) {
        if (dividor == 0) throw new IllegalArgumentException("Dividor cannot be 0");
        return divident / dividor;
    }

}
