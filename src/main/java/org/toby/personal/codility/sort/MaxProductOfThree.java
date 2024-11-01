package org.toby.personal.codility.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MaxProductOfThree
{
    public static int getMaxProductOfThree(final int[] array)
    {
        final var list = Arrays.stream(array).boxed().collect(Collectors.toList());
        list.sort(Integer::compareTo);

        var firstNumber = list.get(0);
        var secondNumber = list.get(1);
        var thirdLastNumber = list.get(list.size() - 3);
        var secondLastNumber = list.get(list.size() - 2);
        var lastNumber = list.get(list.size() - 1);

        final var biggestPossibleNegativeProduct = firstNumber * secondNumber * lastNumber;
        final var biggestPossiblePositiveProduct = thirdLastNumber * secondLastNumber * lastNumber;

        return Math.max(biggestPossiblePositiveProduct, biggestPossibleNegativeProduct);
    }
}
