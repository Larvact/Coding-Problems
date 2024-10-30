package org.toby.personal.codility.iterations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fibonacci
{
    public static List<Long> getFibonacciByWhileLoopLimit(final long valueLimit)
    {
        if(valueLimit == 0)
        {
            return List.of(0L);
        }
        else if (valueLimit < 0)
        {
            return Collections.emptyList();
        }
        final List<Long> result = new ArrayList<>(List.of(0L));
        long previousNumber = result.getFirst();
        long currentNumber = 1;
        while (currentNumber <= valueLimit)
        {
            result.add(currentNumber);
            currentNumber = previousNumber + currentNumber;
            previousNumber = currentNumber - previousNumber;
        }
        return result;
    }
}
