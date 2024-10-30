package org.toby.personal.leetcode.easy;

public class FindFirstMissingPositiveNumber
{
    public static int solution(int[] A)
    {
        final var sortedArray = bubbleSort(A);
        final var firstPositiveNumberIndex = getPositiveNumberIndex(sortedArray);
        return getFirstMissingPositiveNumber(sortedArray, firstPositiveNumberIndex);
    }

    private static int[] bubbleSort(int[] array)
    {
        for(int index = 0; index < array.length; index++)
        {
            for(int j = index; j < array.length; j++)
            {
                if(array[index] > array[j])
                {
                    var temp = array[j];
                    array[j] = array[index];
                    array[index] = temp;
                }
            }
        }
        return array;
    }

    private static int getPositiveNumberIndex(int[] array)
    {
        for(int index = 0; index < array.length; index++)
        {
            if(array[index] > 0)
            {
                return index;
            }
        }
        return -1;
    }

    private static int getFirstMissingPositiveNumber(int[] array, int firstPositiveNumberIndex)
    {
        if(firstPositiveNumberIndex == -1 || array[firstPositiveNumberIndex] > 1)
        {
            return 1;
        }
        else
        {
            var currentNumber = 1;
            for(int index = firstPositiveNumberIndex; index < array.length; index++)
            {
                if(currentNumber == array[index])
                {
                    continue;
                }
                else if (currentNumber + 1 == array[index])
                {
                    currentNumber = currentNumber + 1;
                }
                else
                {
                    return currentNumber + 1;
                }
            }
            return currentNumber;
        }
    }
}
