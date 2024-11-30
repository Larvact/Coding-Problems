package org.toby.personal.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.stream.Stream;

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

    private static Stream<Arguments> provideStringRowNumbersExpectedZigZagResult()
    {
        return Stream.of(
                Arguments.of("PAYPALISHIRING", 1, "PAYPALISHIRING"),
                Arguments.of("PAYPALISHIRING", 2, "PYAIHRNAPLSIIG"), //? Verify manually if others pass
                Arguments.of("PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"),
                Arguments.of("PAYPALISHIRING", 4, "PINALSIGYAHRPI")
        );
    }

    @ParameterizedTest
    @MethodSource("provideStringRowNumbersExpectedZigZagResult")
    void givenStringAndRowNumber_convertToZigZag_zigZagResultReturned(final String string, final int rowNumber, final String expectedZigZag)
    {
        assertEquals(expectedZigZag, ZigzagConversion.convertToZigZag(string, rowNumber));
    }


}