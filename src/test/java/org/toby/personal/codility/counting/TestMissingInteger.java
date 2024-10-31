package org.toby.personal.codility.counting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestMissingInteger
{
    @Test
    void testMissingInteger()
    {
        final var array = new int[6];
        array[0] = 1;
        array[1] = 3;
        array[2] = 6;
        array[3] = 4;
        array[4] = 1;
        array[5] = 2;

        Assertions.assertEquals(5, MissingInteger.findMissingInteger(array));
    }

    @Test
    void testMissingIntegerSingle()
    {
        final var array = new int[1];
        array[0] = 2;

        Assertions.assertEquals(1, MissingInteger.findMissingInteger(array));
    }

}