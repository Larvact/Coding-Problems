package org.toby.personal.leetcode.easy;

public class LengthOfLastWord
{
    public static int lengthOfLastWord(String s)
    {
        final var words = s.split("\\s");
        return words[words.length - 1].length();
    }
}
