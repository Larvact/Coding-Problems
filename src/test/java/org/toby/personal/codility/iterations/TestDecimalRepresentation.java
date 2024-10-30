package org.toby.personal.codility.iterations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDecimalRepresentation
{
    @Test
    void testCountNumberOfDigitsInDecimalRepresentation()
    {
        Assertions.assertEquals(6, DecimalRepresentation.countNumberOfDigitsInDecimalRepresentation(43067300000L));
    }

}