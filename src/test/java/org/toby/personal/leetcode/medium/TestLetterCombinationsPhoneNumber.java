package org.toby.personal.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TestLetterCombinationsPhoneNumber
{

    @Test
    void testLetterCombinations()
    {
        Assertions.assertEquals(List.of("ad","ae","af","bd","be","bf","cd","ce","cf"), LetterCombinationsPhoneNumber.letterCombinations("23"));
    }
}