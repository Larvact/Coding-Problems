package org.toby.personal.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix
{
    public String longestCommonPrefix(final String[] strs)
    {
        if(strs.length == 0){return "";}
        final var smallestWords = getSmallestWords(strs);

        var longestCommonPrefix = "";
        for(final var word : smallestWords)
        {
            final var biggestWordPrefix = getBiggestPrefix(word, strs);
            if (biggestWordPrefix.length() > longestCommonPrefix.length())
            {
                longestCommonPrefix = biggestWordPrefix;
            }
        }
        return longestCommonPrefix;
    }

    private String getBiggestPrefix(final String word, final String[] words)
    {
        for(int index = 0; index < word.length(); index ++)
        {
            final var prefixString = word.substring(0, word.length() - index);
            if(Arrays.stream(words).allMatch(w -> w.startsWith(prefixString)))
            {
                return prefixString;
            }
        }
        return "";
    }

    private Integer getSmallestWordSize(final String[] strs)
    {
        Integer shortestWordSize = null;
        for (String str : strs)
        {
            if (shortestWordSize == null || str.length() < shortestWordSize)
            {
                shortestWordSize = str.length();
            }
        }
        return shortestWordSize;
    }

    private List<String> getSmallestWords(final String[] strs)
    {
        int shortestWordSize = getSmallestWordSize(strs);
        return Arrays.stream(strs)
                .filter(word -> word.length() == shortestWordSize)
                .toList();
    }
}
