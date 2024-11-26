package org.toby.personal.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.toby.personal.leetcode.medium.MaximumSubarray;

import static org.junit.jupiter.api.Assertions.*;

class TestMergeSortedArray
{
    @Test
    void testGetMaximumSubArray()
    {
        final var sortedArrayOne = new int[6];
        sortedArrayOne[0] = 4;
        sortedArrayOne[1] = 0;
        sortedArrayOne[2] = 0;
        sortedArrayOne[3] = 0;
        sortedArrayOne[4] = 0;
        sortedArrayOne[5] = 0;

        final var sortedArrayTwo = new int[5];
        sortedArrayTwo[0] = 1;
        sortedArrayTwo[1] = 2;
        sortedArrayTwo[2] = 3;
        sortedArrayTwo[3] = 5;
        sortedArrayTwo[4] = 6;

        MergeSortedArray.merge(sortedArrayOne, 1, sortedArrayTwo, 5);
    }
}