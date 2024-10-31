package org.toby.personal.codility.timecomplexity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestTapeEquilibrium
{
    @Test
    void testGetTapeEquilibrium()
    {
        final var array = new int[5];
        array[0] = 3;
        array[1] = 1;
        array[2] = 2;
        array[3] = 4;
        array[4] = 3;
        Assertions.assertEquals(1, TapeEquilibrium.getTapeEquilibrium(array));
    }

    @Test
    void testGetTapeEquilibriumTwoElements()
    {
        final var array = new int[2];
        array[0] = -1000;
        array[1] = 1000;
        Assertions.assertEquals(2000, TapeEquilibrium.getTapeEquilibrium(array));
    }
}