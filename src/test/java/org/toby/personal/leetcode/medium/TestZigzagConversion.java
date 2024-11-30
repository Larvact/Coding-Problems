package org.toby.personal.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

class TestZigzagConversion
{

    @Test
    void zeroRows_convertToZigZag_emptyStringReturned()
    {
        assertEquals("", ZigzagConversion.convertToZigZag("fgsdgfdsf", 0));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void blankString_convertToZigZag_emptyStringReturned(final String string)
    {
        assertEquals("", ZigzagConversion.convertToZigZag(string, 3));
    }


}