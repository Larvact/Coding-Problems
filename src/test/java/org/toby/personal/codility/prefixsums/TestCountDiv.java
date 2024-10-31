package org.toby.personal.codility.prefixsums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCountDiv
{
    @Test
    void testGetDivisibleNumbersCountWithinBoundary()
    {
        Assertions.assertEquals(3, CountDiv.getDivisibleNumbersCountWithinBoundaryOptimised(6,11,2));
    }
}