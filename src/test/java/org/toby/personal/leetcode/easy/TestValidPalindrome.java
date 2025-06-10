package org.toby.personal.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestValidPalindrome {

    private static Stream<Arguments> providePalindromeTestStrings() {
        return Stream.of(
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("race a car", false),
                Arguments.of("0P", false),
                Arguments.of(" ", true),
                Arguments.of(null, false)
        );
    }

    @MethodSource("providePalindromeTestStrings")
    @ParameterizedTest
    void provide_strings_palindrome_correctly_determined(String string, boolean expectedResult){
        Assertions.assertEquals(expectedResult, ValidPalindrome.isPalindrome(string));
    }

}