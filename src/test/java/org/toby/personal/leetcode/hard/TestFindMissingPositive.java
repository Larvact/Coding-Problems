package org.toby.personal.leetcode.hard;

import org.junit.jupiter.api.Test;
import org.toby.personal.leetcode.easy.FindFirstMissingPositiveNumber;

import static org.junit.jupiter.api.Assertions.*;

class TestFindMissingPositive
{
    @Test
    void testFindMissingPositive()
    {
        final var array = new int[4];
        array[0] = 4;
        array[1] = 1;
        array[2] = 3;
        array[3] = 3;
        final var test = FindMissingPositive.firstMissingPositive(array);
    }

    @Test
    void testFindMissingPositiveOneNumber()
    {
        final var array = new int[2];
        array[0] = 1;
        array[1] = 1;
        final var test = FindMissingPositive.firstMissingPositive(array);
    }

}