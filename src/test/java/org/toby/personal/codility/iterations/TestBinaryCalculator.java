package org.toby.personal.codility.iterations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestBinaryCalculator
{
    @Test
    void testGetMaximumBinaryGap()
    {
        Assertions.assertEquals(0, BinaryCalculator.getBinaryRepresentation(6));
    }

}