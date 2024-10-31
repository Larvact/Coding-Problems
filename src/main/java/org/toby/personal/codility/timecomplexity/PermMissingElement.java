package org.toby.personal.codility.timecomplexity;

public class PermMissingElement
{
    public static int findMissingNumberIncrementingArray(int[] incrementingArray)
    {
        long missingNumber = ((long) (incrementingArray.length + 1) * (incrementingArray.length + 2)) / 2;
        for (int value : incrementingArray)
        {
            missingNumber -= value;
        }
        return (int) missingNumber;
    }
}
