package org.toby.personal.codility.iterations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestFibonacci
{
    @Test
    void testGetFibonacciByWhileLoopLimit()
    {
        Assertions.assertEquals(21, Fibonacci.getFibonacciByWhileLoopLimit(10000).size());
    }
}