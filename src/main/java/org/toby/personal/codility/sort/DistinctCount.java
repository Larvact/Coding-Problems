package org.toby.personal.codility.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class DistinctCount
{
    public static int getDistinctCount(int[] array)
    {
        final var list = new ArrayList<>(Arrays.stream(array).boxed().collect(Collectors.toList()));
        list.sort(Integer::compareTo);
        var distinctCount = list.isEmpty() ? 0 : 1;
        for (var index = 0; index < list.size() - 1; index++)
        {
            if(!list.get(index).equals(list.get(index + 1)))
            {
                distinctCount += 1;
            }
        }
        return distinctCount;
    }
}
