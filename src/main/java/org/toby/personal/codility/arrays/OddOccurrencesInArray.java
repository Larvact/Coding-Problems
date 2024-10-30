package org.toby.personal.codility.arrays;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray
{
    public static int findOddOccurrence(int[] array)
    {
        final Map<Integer, Integer> occurrenceCountMap = new HashMap<>();
        for (int value : array)
        {
            occurrenceCountMap.compute(value, (key, currentValue) -> currentValue == null ? 1 : currentValue + 1);
        }
        return occurrenceCountMap.entrySet().stream()
                .filter(pair -> pair.getValue() % 2 != 0)
                .findAny()
                .map(Map.Entry::getKey)
                .orElseThrow();
    }
}
