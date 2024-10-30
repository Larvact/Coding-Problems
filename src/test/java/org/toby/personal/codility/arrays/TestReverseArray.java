package org.toby.personal.codility.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestReverseArray
{
    @Test
    void testReverseArray()
    {
        final var array = new Integer[4];
        array[0] = 5;
        array[1] = 77;
        array[2] = 4;
        array[3] = -6;
        ReverseArray.reverseArray(array);
        Assertions.assertEquals(-6, array[0]);
        Assertions.assertEquals(4, array[1]);
        Assertions.assertEquals(77, array[2]);
        Assertions.assertEquals(5, array[3]);

    }

}