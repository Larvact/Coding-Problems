package org.toby.personal.codility.counting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestMaxCounters
{
    @Test
    void testCountCounters()
    {
        final var array = new int[7];
        array[0] = 3;
        array[1] = 4;
        array[2] = 4;
        array[3] = 6;
        array[4] = 1;
        array[5] = 4;
        array[6] = 4;

        final var result = MaxCounters.countCounters(5, array);

        Assertions.assertEquals(3, result[0]);
        Assertions.assertEquals(2, result[1]);
        Assertions.assertEquals(2, result[2]);
        Assertions.assertEquals(4, result[3]);
        Assertions.assertEquals(2, result[4]);
    }
}