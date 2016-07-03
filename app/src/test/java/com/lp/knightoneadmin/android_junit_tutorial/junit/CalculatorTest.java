package com.lp.knightoneadmin.android_junit_tutorial.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** 
 * Create By Time:2016-7-2 
 * @author knightoneadmin 
 * @e-mail: 37442216knight@gmail.com 
 * @describe: Calculator 计算器 测试
 */
public class CalculatorTest {
    private Calculator mCalculator;
    @Before
   public  void setup(){
        if(mCalculator==null)
         mCalculator = new Calculator();
    }
    @Test
    public  void testAdd(){
        int sum = mCalculator.add(3, 4);
        Assert.assertEquals(7,sum);
    }
    @Test
    public  void testMultiply(){
        int sum = mCalculator.multiply(3, 4);
        Assert.assertEquals(12,sum);
    }

    @Test(expected = IllegalArgumentException.class)
    public  void testDivide(){
        double divide =  mCalculator.divide(5, 0);

    }
}
