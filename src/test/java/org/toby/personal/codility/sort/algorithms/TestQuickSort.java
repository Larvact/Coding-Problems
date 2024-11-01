package org.toby.personal.codility.sort.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.toby.personal.codility.sort.algorithms.QuickSort;


class TestQuickSort
{
    @Test
    void testQuickSort()
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

        QuickSort.quickSort(array);

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