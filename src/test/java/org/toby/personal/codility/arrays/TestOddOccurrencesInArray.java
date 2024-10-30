package org.toby.personal.codility.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestOddOccurrencesInArray
{
    @Test
    void testOddOccurrencesInArray()
    {
        final var array = new int[5];
        array[0] = 4;
        array[1] = 4;
        array[2] = 7;
        array[3] = -6;
        array[4] = -6;
        Assertions.assertEquals(7, OddOccurrencesInArray.findOddOccurrence(array));
    }

}