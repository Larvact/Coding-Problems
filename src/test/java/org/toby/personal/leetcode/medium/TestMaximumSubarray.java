package org.toby.personal.leetcode.medium;

import org.junit.jupiter.api.Test;
import org.toby.personal.leetcode.easy.FindFirstMissingPositiveNumber;

import static org.junit.jupiter.api.Assertions.*;

class TestMaximumSubarray
{
    @Test
    void testGetMaximumSubArray()
    {
        final var array = new int[9];
        array[0] = -2;
        array[1] = 1;
        array[2] = -3;
        array[3] = 4;
        array[4] = -1;
        array[5] = 2;
        array[6] = 1;
        array[7] = -5;
        array[8] = 4;

        final var test = MaximumSubarray.getMaximumSubArray(array);


    }

}