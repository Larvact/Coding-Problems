package org.toby.personal.leetcode.easy;

public class MergeSortedArray
{
    public static void merge(int[] numberArrayOne, int m, int[] numberArrayTwo, int n)
    {
        if(numberArrayTwo.length == 0){return;}
        int numberArrayTwoIndex = 0;
        int currentArrayTwoNumber = numberArrayTwo[numberArrayTwoIndex];
        int shiftingToIndex = numberArrayOne.length - n;
        for(int arrayOneIndex = 0; arrayOneIndex < m; arrayOneIndex++)
        {
            if(currentArrayTwoNumber < numberArrayOne[arrayOneIndex])
            {
                shiftElementsUpwardsFrom(numberArrayOne, shiftingToIndex, arrayOneIndex);
                numberArrayOne[arrayOneIndex] = currentArrayTwoNumber;
                numberArrayTwoIndex ++;
                if(numberArrayTwoIndex == n){return;}
                currentArrayTwoNumber = numberArrayTwo[numberArrayTwoIndex];
                shiftingToIndex++;
                m++;
            }
        }
        for(int finalInsertionIndex = numberArrayTwoIndex; finalInsertionIndex < n; finalInsertionIndex++)
        {
            numberArrayOne[numberArrayOne.length - n + finalInsertionIndex] = numberArrayTwo[finalInsertionIndex];
        }
    }

    private static void shiftElementsUpwardsFrom(final int[] array, int toIndex, final int fromIndex)
    {
        while (toIndex > fromIndex)
        {
            array[toIndex] = array[toIndex - 1];
            toIndex--;
        }
    }
}
