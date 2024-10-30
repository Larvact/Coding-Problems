package org.toby.personal.codility.arrays;

public class CyclicRotation
{
    public static <T> void cycleArray(T[] array, int numberOfCycles)
    {
        if(array.length == 0){return;}
        for(var cycleIndex = 0; cycleIndex < numberOfCycles; cycleIndex++)
        {
            var previousValue = array[0];
            for(var index = 0; index < array.length; index++)
            {
                var toChangeIndex = index == array.length - 1 ? 0 : index + 1;
                var toChangeValue = array[toChangeIndex];
                array[toChangeIndex] = previousValue;
                previousValue = toChangeValue;
            }
        }
    }
}
