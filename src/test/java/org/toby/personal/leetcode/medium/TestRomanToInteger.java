package org.toby.personal.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestRomanToInteger
{
    @MethodSource("provideRomanNumeralsIntegerTest")
    @ParameterizedTest
    void testRomanNumeralsInteger(final String numeral, final int expectedNumber)
    {
        Assertions.assertEquals(expectedNumber, RomanToInteger.romanToInt(numeral));
    }

    private static Stream<Arguments> provideRomanNumeralsIntegerTest()
    {
        return Stream.of(
                Arguments.of("MMMDCCXLIX", 3749),
                Arguments.of("LVIII", 58),
                Arguments.of( "MCMXCIV", 1994));
    }
}