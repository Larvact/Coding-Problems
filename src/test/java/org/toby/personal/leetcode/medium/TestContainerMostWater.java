package org.toby.personal.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestContainerMostWater
{

    @Test
    void smallestContainer_testMaxArea_returnsOne()
    {
        final var array = new int[2];
        array[0] = 1;
        array[1] = 1;

        Assertions.assertEquals(1, ContainerMostWater.maxArea(array));
    }

    @Test
    void populatedContainer_testMaxArea_returnsFortyNine()
    {
        final var array = new int[9];
        array[0] = 1;
        array[1] = 8;
        array[2] = 6;
        array[3] = 2;
        array[4] = 5;
        array[5] = 4;
        array[6] = 8;
        array[7] = 3;
        array[8] = 7;

        Assertions.assertEquals(49, ContainerMostWater.maxArea(array));
    }

}