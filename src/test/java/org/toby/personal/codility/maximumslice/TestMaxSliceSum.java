package org.toby.personal.codility.maximumslice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestMaxSliceSum
{
    @Test
    void testGetMaxSliceSumSort()
    {
        final var array = new int[5];
        array[0] = 3;
        array[1] = 2;
        array[2] = -6;
        array[3] = 4;
        array[4] = 0;


        Assertions.assertEquals(5, MaxSliceSum.getMaxSliceSum(array));
    }
}