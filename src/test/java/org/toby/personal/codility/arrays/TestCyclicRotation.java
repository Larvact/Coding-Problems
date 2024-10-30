package org.toby.personal.codility.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCyclicRotation
{
    @Test
    void testCycleArray()
    {
        final var array = new Integer[4];
        array[0] = 5;
        array[1] = 77;
        array[2] = 4;
        array[3] = -6;
        CyclicRotation.cycleArray(array, 1);
        Assertions.assertEquals(-6, array[0]);
        Assertions.assertEquals(5, array[1]);
        Assertions.assertEquals(77, array[2]);
        Assertions.assertEquals(4, array[3]);
    }

}