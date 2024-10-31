package org.toby.personal.codility.counting;

import java.util.Arrays;

public class MaxCounters
{
    public static int[] countCounters(int maxCountBoundary, int[] instancesArray)
    {
        var maximumCount = 0;
        final var counts = new int[maxCountBoundary];
        for (final int countValue : instancesArray)
        {
            final var countValueIndex = countValue - 1;
            if (countValueIndex == maxCountBoundary)
            {
                Arrays.fill(counts, maximumCount);
            }
            else
            {
                counts[countValueIndex] += 1;
                if (maximumCount < counts[countValueIndex])
                {
                    maximumCount = counts[countValueIndex];
                }
            }
        }
        return counts;
    }
}
