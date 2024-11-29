package org.toby.personal.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class TestLongestPalindromeSubstring
{
    @Test
    void nullString_getLongestPalindromeSubstring_returnNull()
    {
        Assertions.assertNull(LongestPalindromeSubstring.getLongestPalindromeSubstring(null));
    }

    private static Stream<Arguments> provideStringsAndSubstringResult()
    {
        return Stream.of(Arguments.of("", ""),
                Arguments.of("a", "a"),
                Arguments.of("ab", "b"),
                Arguments.of("bb", "bb"),
                Arguments.of("cabag", "aba"),
                Arguments.of("cbbd", "bb"),
                Arguments.of("gdsgbbbrfh", "bbb"),
                Arguments.of("bbbgdsgrfh", "bbb"),
                Arguments.of("gdsgrfhbbb", "bbb"),
                Arguments.of("ticktickrrkcitkcit", "ticktickrrkcitkcit")
        );
    }

    @ParameterizedTest
    @MethodSource("provideStringsAndSubstringResult")
    void givenString_getLongestPalindromeSubstring_returnSubstring(final String string, final String expectedSubstring)
    {
        Assertions.assertEquals(expectedSubstring, LongestPalindromeSubstring.getLongestPalindromeSubstring(string));
    }
}
