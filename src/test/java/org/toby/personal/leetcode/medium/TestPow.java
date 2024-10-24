package org.toby.personal.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestPow
{
    private Pow pow;

    @BeforeEach
    void setup()
    {
        pow = new Pow();
    }

    @Test
    void powerOfNumber_by_loop_correctResult()
    {
        Assertions.assertEquals(0.25, pow.myPow(2, -2147483648));
    }

    @Test
    void powerOfNumber_by_recursion_correctResult()
    {
        Assertions.assertEquals(0.25, pow.myPowRecursion(-2, 3));
    }
}