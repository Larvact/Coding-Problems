package org.toby.personal.codility.sort;

public class SelectionSort
{
    public static void selectionSort(int[] array)
    {
        for(var index = 0; index < array.length; index++)
        {
            var minValue = array[index];
            for(var jIndex = index + 1; jIndex < array.length; jIndex++)
            {
                var currentValue = array[jIndex];
                if(currentValue < minValue)
                {
                    array[index] = currentValue;
                    array[jIndex] = minValue;
                    minValue = currentValue;
                }
            }
        }
    }
}
