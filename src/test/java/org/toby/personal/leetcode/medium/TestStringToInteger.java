package org.toby.personal.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestStringToInteger {

    @MethodSource("provideStringsForToInt")
    @ParameterizedTest
    void shouldConvertStringToInt(String string, int expectedInteger){
        Assertions.assertEquals(expectedInteger, StringToInteger.myAtoi(string));
    }

    private static Stream<Arguments> provideStringsForToInt() {
        return Stream.of(
                Arguments.of("42", 42),
                Arguments.of("+42", 42),
                Arguments.of("   -042", -42),
                Arguments.of("1337c0d3", 1337),
                Arguments.of("0-1", 0),
                Arguments.of("words and 987", 0),
                Arguments.of("2147483647", 2147483647),
                Arguments.of("2147483648", 2147483647),
                Arguments.of("-2147483648", -2147483648),
                Arguments.of("-2147483649", -2147483648)
        );
    }

}