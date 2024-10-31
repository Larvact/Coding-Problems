package org.toby.personal.codility.counting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestFrogRiverOne
{
    @Test
    void testEarlistTimeFrogCanMakeIt()
    {
        final var array = new int[8];
        array[0] = 1;
        array[1] = 3;
        array[2] = 1;
        array[3] = 4;
        array[4] = 2;
        array[5] = 3;
        array[6] = 5;
        array[7] = 4;
        Assertions.assertEquals(4, FrogRiverOne.earlistTimeFrogCanMakeIt(3, array));
    }

}