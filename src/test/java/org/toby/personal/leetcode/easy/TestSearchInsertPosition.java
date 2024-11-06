package org.toby.personal.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestSearchInsertPosition
{
    @Test
    void testSearchInsert()
    {
        final var array = new int[4];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 6;

        Assertions.assertEquals(1, SearchInsertPosition.searchInsert(array, 2));
    }

}