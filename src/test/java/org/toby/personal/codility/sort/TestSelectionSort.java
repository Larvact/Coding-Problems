package org.toby.personal.codility.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestSelectionSort
{
    @Test
    void testSelectionSort()
    {
        final var array = new int[6];
        array[0] = 1;
        array[1] = 3;
        array[2] = 6;
        array[3] = 4;
        array[4] = 1;
        array[5] = 2;

        SelectionSort.selectionSort(array);

        Assertions.assertEquals(1, array[0]);
        Assertions.assertEquals(1, array[1]);
        Assertions.assertEquals(2, array[2]);
        Assertions.assertEquals(3, array[3]);
        Assertions.assertEquals(4, array[4]);
        Assertions.assertEquals(6, array[5]);
    }

}