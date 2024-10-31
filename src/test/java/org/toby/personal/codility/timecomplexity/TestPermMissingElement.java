package org.toby.personal.codility.timecomplexity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestPermMissingElement
{
    @Test
    void testFindMissingNumberIncrementingArray()
    {
        final var array = new int[5];
        array[0] = 3;
        array[1] = 1;
        array[2] = 2;
        array[3] = 5;
        array[4] = 6;
        Assertions.assertEquals(4, PermMissingElement.findMissingNumberIncrementingArray(array));
    }

}