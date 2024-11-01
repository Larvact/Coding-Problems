package org.toby.personal.codility.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMaxProductOfThree
{
    @Test
    void testGetMaxProductOfThree()
    {
        final var array = new int[5];
        array[0] = -5;
        array[1] = -6;
        array[2] = -4;
        array[3] = -7;
        array[4] = -10;

        Assertions.assertEquals(-120, MaxProductOfThree.getMaxProductOfThree(array));
    }

}