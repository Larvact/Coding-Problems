package org.toby.personal.codility.counting;

public class MissingInteger
{
    public static int findMissingInteger(int[] array)
    {
        final var counts = new int[array.length];
        for (int number : array)
        {
            var countIndex = number - 1;
            if (countIndex > - 1 && countIndex < counts.length)
            {
                counts[countIndex] += 1;
            }
        }
        for(var countIndex = 0; countIndex < counts.length; countIndex++)
        {
            if(counts[countIndex] == 0)
            {
                return countIndex + 1;
            }
        }
        return counts.length + 1;
    }
}
