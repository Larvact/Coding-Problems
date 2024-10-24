package org.toby.personal.leetcode.medium;

import java.util.Arrays;

public class Pow
{
    private static final int RECURSION_PARTITION_SIZE = 10000;

    public double myPow(double number, int power)
    {
        if(number == 1 || power == 0){return 1;}
        double result = 1;
        int positivePower = getPositivePower(power);
        while (positivePower > 0)
        {
            result = result * number;
            positivePower = positivePower - 1;
        }
        return power >= 0 ? result : 1/result;
    }

    private int getPositivePower(int power)
    {
        if(power == Integer.MIN_VALUE){return Integer.MAX_VALUE;}
        return Math.abs(power);
    }

    public double myPowRecursion(double number, int power)
    {
        int positivePower = power == Integer.MIN_VALUE ? Integer.MAX_VALUE : Math.abs(power);
        double [] resultArray = initialiseResultArray(positivePower);
        if(resultArray.length > 1)
        {
            double maximumPowRecursionValue = calculate(number, RECURSION_PARTITION_SIZE, 1);
            for(int index = 0; index < resultArray.length - 1; index++)
            {
                resultArray[index] = maximumPowRecursionValue;
            }
        }
        resultArray[resultArray.length - 1] = power == Integer.MIN_VALUE ? calculate(number, positivePower % RECURSION_PARTITION_SIZE + 1, 1) : calculate(number, positivePower % RECURSION_PARTITION_SIZE, 1);
        double result = Arrays.stream(resultArray)
                .reduce(1, (doubleOne, doubleTwo) -> doubleOne * doubleTwo);
        return power >= 0 ? result : 1/result;
    }

    private double calculate(double base, int power, double currentResult)
    {
        if(power > 0)
        {
            currentResult = base * currentResult;
            return calculate(base, power - 1, currentResult);
        }
        return currentResult;
    }

    private double[] initialiseResultArray(int power)
    {
        int arraySize = power / RECURSION_PARTITION_SIZE;
        if(power % RECURSION_PARTITION_SIZE != 0)
        {
            arraySize ++;
        }
        return new double[arraySize];
    }

}
