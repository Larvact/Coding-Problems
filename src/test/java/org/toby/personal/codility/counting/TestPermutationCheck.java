package org.toby.personal.codility.counting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestPermutationCheck
{
    @Test
    void invalidPermutation_testPermutationCheck_returnsZero()
    {
        final var array = new int[3];
        array[0] = 4;
        array[1] = 1;
        array[2] = 3;
        Assertions.assertEquals(0, PermutationCheck.isPermutationValid(array));
    }

    @Test
    void validPermutation_testPermutationCheck_returnsOne()
    {
        final var array = new int[4];
        array[0] = 4;
        array[1] = 1;
        array[2] = 3;
        array[3] = 2;
        Assertions.assertEquals(1, PermutationCheck.isPermutationValid(array));
    }
}