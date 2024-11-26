package org.toby.personal.leetcode.medium;

public class MaximumSubarray
{
    public static int getMaximumSubArray(int[] numbers)
    {
        int globalMaximum = numbers[0];
        int localMaximum = numbers[0];

        for(int numberIndex = 1; numberIndex < numbers.length; numberIndex++)
        {
            if(localMaximum > 0)
            {
                localMaximum = localMaximum + numbers[numberIndex];
            }
            else
            {
                localMaximum = numbers[numberIndex];
            }
            if(localMaximum > globalMaximum)
            {
                globalMaximum = localMaximum;
            }
        }
        return globalMaximum;
    }
}
