package org.toby.personal.codility.sort.algorithms;

public class CountingSort
{
    public static void countingSort(int[] array, int maximumAbsNumber)
    {
        final var negativeNumberCount = new int[maximumAbsNumber];
        final var naturalNumberCount = new int[maximumAbsNumber + 1];
        for (final int value : array)
        {
            if (value < 0)
            {
                negativeNumberCount[Math.abs(value + 1)] += 1;
            }
            else
            {
                naturalNumberCount[value] += 1;
            }
        }
        var currentArrayIndex = 0;
        for(var negativeIndex = maximumAbsNumber - 1; negativeIndex > -1; negativeIndex--)
        {
            final var currentNumberCount = negativeNumberCount[negativeIndex];
            if(currentNumberCount > 0)
            {
                for(var occurrence = 1; occurrence <= currentNumberCount; occurrence++)
                {
                    array[currentArrayIndex] = Math.negateExact(negativeIndex + 1);
                    currentArrayIndex++;
                }
            }
        }
        for(var naturalNumber = 0; naturalNumber < maximumAbsNumber + 1; naturalNumber++)
        {
            final var currentNumberCount = naturalNumberCount[naturalNumber];
            if(currentNumberCount > 0)
            {
                for(var occurrence = 1; occurrence <= currentNumberCount; occurrence++)
                {
                    array[currentArrayIndex] = naturalNumber;
                    currentArrayIndex++;
                }
            }
        }
    }
}
