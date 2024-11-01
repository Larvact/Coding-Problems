package org.toby.personal.codility.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestDistinctCount
{
    @Test
    void testDistinctCount()
    {
        final var array = new int[6];
        array[0] = 2;
        array[1] = 1;
        array[2] = 1;
        array[3] = 2;
        array[4] = 3;
        array[5] = 1;

        Assertions.assertEquals(3, DistinctCount.getDistinctCount(array));
    }
}