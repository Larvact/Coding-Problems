package org.toby.personal.leetcode.medium;

import java.util.Objects;

public class LongestPalindromeSubstring
{

    public static String getLongestPalindromeSubstring(final String string)
    {
        if(Objects.isNull(string)){return null;}
        var longestPalindrome = "";
        for(int pivotIndex = 0; pivotIndex < string.length(); pivotIndex++)
        {
            if(longestPalindrome.length() < 2)
            {
                longestPalindrome = getStringAtIndex(string, pivotIndex);
            }
            var longestPivotPalindrome = getLongestPivotPalindrome(string, pivotIndex);
            final var longestPivotPairPalindrome = getLongestPivotPairPalindrome(string, pivotIndex);
            longestPivotPalindrome = longestPivotPalindrome.length() > longestPivotPairPalindrome.length() ? longestPivotPalindrome : longestPivotPairPalindrome;
            if(longestPivotPalindrome.length() >= longestPalindrome.length())
            {
                longestPalindrome = longestPivotPalindrome;
            }
        }
        return longestPalindrome;
    }

    private static String getLongestPivotPalindrome(final String fullString, final int pivotIndex)
    {
        var pivotPalindrome = new StringBuilder(getStringAtIndex(fullString, pivotIndex));
        return getLongestPivotPalindrome(fullString, pivotIndex, pivotPalindrome);
    }

    private static String getLongestPivotPairPalindrome(final String fullString, final int pivotIndex)
    {
        final var pivotStringAtIndex = getStringAtIndex(fullString, pivotIndex);
        if(pivotIndex == fullString.length() - 1 || !pivotStringAtIndex.equals(getStringAtIndex(fullString, pivotIndex + 1)))
        {
            return "";
        }
        var pivotPalindrome = new StringBuilder(pivotStringAtIndex).append(pivotStringAtIndex);
        return getLongestPivotPalindrome(fullString, pivotIndex, pivotPalindrome);
    }

    private static String getLongestPivotPalindrome(final String fullString, final int pivotIndex, StringBuilder pivotPalindromeBuilder)
    {
        var pivotSize = pivotPalindromeBuilder.length();
        var pivotPalindromeChar = getStringAtIndex(fullString, pivotIndex);
        var isPivotPalindromeAllPivotChars = true;
        var palindromeSearchCount = 0;
        while (shouldContinuePalindromeSearch(pivotIndex, palindromeSearchCount, fullString.length()))
        {
            final var nextLhsChar = getStringAtIndex(fullString, pivotIndex - palindromeSearchCount - 1);
            final var nextRhsChar = getStringAtIndex(fullString, pivotIndex + palindromeSearchCount + pivotSize);
            if(nextLhsChar.equals(nextRhsChar))
            {
                pivotPalindromeBuilder = new StringBuilder(nextLhsChar + pivotPalindromeBuilder + nextRhsChar);
                if(!nextLhsChar.equals(pivotPalindromeChar))
                {
                    isPivotPalindromeAllPivotChars = false;
                }
                palindromeSearchCount++;
            }
            else if (isPivotPalindromeAllPivotChars && nextLhsChar.equals(pivotPalindromeChar))
            {
                pivotPalindromeBuilder.insert(0, nextLhsChar);
                return pivotPalindromeBuilder.toString();
            }
            else if (isPivotPalindromeAllPivotChars && nextRhsChar.equals(pivotPalindromeChar))
            {
                pivotPalindromeBuilder.insert(pivotPalindromeBuilder.length(), nextRhsChar);
                return pivotPalindromeBuilder.toString();
            }
            else
            {
                return pivotPalindromeBuilder.toString();
            }
        }
        return pivotPalindromeBuilder.toString();
    }

    private static boolean shouldContinuePalindromeSearch(final int pivotIndex, final int searchCount, final int searchLimitUpperBoundary)
    {
        return pivotIndex - searchCount > 0 || pivotIndex + searchCount < searchLimitUpperBoundary;
    }

    private static String getStringAtIndex(final String string, final int index)
    {
        if(index < 0 || index > string.length() - 1)
        {
            return "";
        }
        return string.substring(index, index + 1);
    }
}
