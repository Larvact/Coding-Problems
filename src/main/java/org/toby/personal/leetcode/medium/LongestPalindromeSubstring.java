package org.toby.personal.leetcode.medium;

import java.util.Objects;

public class LongestPalindromeSubstring
{

    public static String getLongestPalindromeSubstring(final String string)
    {
        if(Objects.isNull(string)){return null;}

        var longestPalindrome = "";
        for(char pivotIndex = 0; pivotIndex < string.length(); pivotIndex++)
        {
            if(longestPalindrome.length() < 2)
            {
                longestPalindrome = getStringAtIndex(string, pivotIndex);
            }
            final var longestPivotPalindrome = getLongestPivotPalindrome(string, pivotIndex);
            if(longestPivotPalindrome.length() >= longestPalindrome.length())
            {
                longestPalindrome = longestPivotPalindrome;
            }
        }
        return longestPalindrome;
    }

    private static String getLongestPivotPalindrome(final String fullString, char pivotIndex)
    {
        var pivotPalindrome = getStringAtIndex(fullString, pivotIndex);
        var palindromeSearchCount = 1;
        while (shouldContinuePalindromeSearch(pivotIndex, palindromeSearchCount, fullString.length()))
        {
            final var nextLhsChar = getStringAtIndex(fullString, pivotIndex - palindromeSearchCount);
            final var nextRhsChar = getStringAtIndex(fullString, pivotIndex + palindromeSearchCount);
            if(nextLhsChar.equals(nextRhsChar))
            {
                pivotPalindrome = nextLhsChar + pivotPalindrome + nextRhsChar;
                palindromeSearchCount++;
            }
            else
            {
                break;
            }
        }
        return pivotPalindrome;
    }

    private static boolean shouldContinuePalindromeSearch(final int pivotIndex, final int searchCount, final int searchLimitUpperBoundary)
    {
        return pivotIndex - searchCount > -1 && pivotIndex + searchCount < searchLimitUpperBoundary;
    }

    private static String getStringAtIndex(final String string, final int index)
    {
        if(index < 0 || index > string.length() - 1)
        {
            throw new IllegalArgumentException(String.format("Index [%s] is out of bounds", index));
        }
        return string.substring(index, index + 1);
    }
}
