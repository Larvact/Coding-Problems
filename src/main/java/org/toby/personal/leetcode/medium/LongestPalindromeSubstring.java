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
            var localPalindrome = String.valueOf(string.charAt(pivotIndex));
            if(longestPalindrome.length() < 2)
            {
                longestPalindrome = localPalindrome;
            }

            var localIsPalindrome = true;
            var palindromeSearchCount = 1;
            while (localIsPalindrome && shouldContinuePalindromeSearch(pivotIndex, palindromeSearchCount, string.length()))
            {
                final var nextLhsChar = getStringAtIndex(string, pivotIndex - palindromeSearchCount);
                final var nextRhsChar = getStringAtIndex(string, pivotIndex + palindromeSearchCount);
                if(nextLhsChar.equals(nextRhsChar))
                {
                    localPalindrome = nextLhsChar + localPalindrome + nextRhsChar;
                    if(localPalindrome.length() > longestPalindrome.length())
                    {
                        longestPalindrome = localPalindrome;
                    }
                    palindromeSearchCount++;
                }
                else
                {
                    localIsPalindrome = false;
                }
            }
        }
        return longestPalindrome;
    }

    private static boolean shouldContinuePalindromeSearch(final char pivotIndex, final int searchCount, final int searchLimitUpperBoundary)
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
