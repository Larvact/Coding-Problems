package org.toby.personal.leetcode.medium;

public class DivideTwoIntegers
{
    public static int divide(int dividend, int divisor)
    {
        final var positiveDivisor = Math.abs(divisor);
        final var positiveDividend = Math.abs(dividend);

        var currentNumber = 0;
        var result = 0;
        while (currentNumber + positiveDivisor <= positiveDividend)
        {
            currentNumber += positiveDivisor;
            result++;
        }
        return determineResultSign(result, dividend, divisor);
    }

    private static int determineResultSign(int result, int dividend, int divisor)
    {
        if(dividend > 0 && divisor > 0)
        {
            return result;
        }
        else if (dividend < 0 && divisor > 0)
        {
            return -result;
        }
        else if (dividend > 0 && divisor < 0)
        {
            return -result;
        }
        else
        {
            return result;
        }
    }
}
