package org.toby.personal.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestIntegerToRoman
{
    @MethodSource("provideIntegerRomanNumeralsTest")
    @ParameterizedTest
    void testIntegerRomanNumerals(final int number, final String expectedNumeral)
    {
        Assertions.assertEquals(expectedNumeral, IntegerToRoman.intToRoman(number));
    }

    private static Stream<Arguments> provideIntegerRomanNumeralsTest()
    {
        return Stream.of(
                Arguments.of(3749, "MMMDCCXLIX"),
                Arguments.of(58, "LVIII"),
                Arguments.of(1994, "MCMXCIV"));
    }
}