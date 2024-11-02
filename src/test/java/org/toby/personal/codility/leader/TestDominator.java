package org.toby.personal.codility.leader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestDominator
{
    @Test
    void testGetFirstDominatorIndex()
    {
        final var array = new int[8];
        array[0] = 4;
        array[1] = 3;
        array[2] = 3;
        array[3] = 2;
        array[4] = 3;
        array[5] = -1;
        array[6] = 3;
        array[7] = 3;

        Assertions.assertEquals(1, Dominator.getFirstDominatorIndex(array));
    }

}