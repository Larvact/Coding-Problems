package org.toby.personal.codility.prefixsums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.toby.personal.codility.counting.MissingInteger;

import static org.junit.jupiter.api.Assertions.*;

class TestPassingCars
{
    @Test
    void testGetNumberOfPastCars()
    {
        final var array = new int[5];
        array[0] = 0;
        array[1] = 1;
        array[2] = 0;
        array[3] = 1;
        array[4] = 1;

        Assertions.assertEquals(5, PassingCars.getNumberOfPastCars(array));
    }
}