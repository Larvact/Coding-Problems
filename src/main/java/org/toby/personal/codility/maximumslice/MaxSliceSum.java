package org.toby.personal.codility.maximumslice;

public class MaxSliceSum
{
    public static int getMaxSliceSum(int[] numbers)
    {
        var localSum = 0;
        var maximumSum = numbers[0];

        for (int currentValue : numbers)
        {
            localSum = Math.max(currentValue, localSum + currentValue);
            maximumSum = Math.max(maximumSum, localSum);
        }
        return maximumSum;
    }
}
