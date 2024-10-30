package org.toby.personal.codility.iterations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestFactorial
{
    @Test
    void testComputeFactorialByIteration()
    {
        Assertions.assertEquals(120, Factorial.computeFactorialByIteration(5));
    }

    @Test
    void testComputeFactorialByRecursion()
    {
        Assertions.assertEquals(120, Factorial.computeFactorialByRecursion(5));
    }
}