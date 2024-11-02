package org.toby.personal.codility.leader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestEquiLeader
{
    @Test
    void testGetEquiLeaderCount()
    {
        final var array = new int[6];
        array[0] = 4;
        array[1] = 3;
        array[2] = 4;
        array[3] = 4;
        array[4] = 4;
        array[5] = 2;

        Assertions.assertEquals(2, EquiLeader.getEquiLeaderCount(array));
    }

}