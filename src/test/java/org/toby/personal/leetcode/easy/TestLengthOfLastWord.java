package org.toby.personal.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestLengthOfLastWord
{
    @Test
    void testLengthOfLastWord()
    {
        Assertions.assertEquals(4, LengthOfLastWord.lengthOfLastWord("   fly me  to   the moon  "));
    }

}