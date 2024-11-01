package org.toby.personal.codility.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCountingSort
{
    @Test
    void testCountingSort()
    {
        final var array = new int[6];
        array[0] = 1;
        array[1] = 3;
        array[2] = 6;
        array[3] = 4;
        array[4] = 1;
        array[5] = 2;

        CountingSort.countingSort(array, 6);

        Assertions.assertEquals(1, array[0]);
        Assertions.assertEquals(1, array[1]);
        Assertions.assertEquals(2, array[2]);
        Assertions.assertEquals(3, array[3]);
        Assertions.assertEquals(4, array[4]);
        Assertions.assertEquals(6, array[5]);
    }

    @Test
    void testCountingSortWithNegativeNumbers()
    {
        final var array = new int[9];
        array[0] = 1;
        array[1] = 3;
        array[2] = 0;
        array[3] = 6;
        array[4] = -6;
        array[5] = 4;
        array[6] = -4;
        array[7] = 1;
        array[8] = 2;

        CountingSort.countingSort(array, 6);

        Assertions.assertEquals(-6, array[0]);
        Assertions.assertEquals(-4, array[1]);
        Assertions.assertEquals(0, array[2]);
        Assertions.assertEquals(1, array[3]);
        Assertions.assertEquals(1, array[4]);
        Assertions.assertEquals(2, array[5]);
        Assertions.assertEquals(3, array[6]);
        Assertions.assertEquals(4, array[7]);
        Assertions.assertEquals(6, array[8]);
    }
}