package org.toby.personal.leetcode.medium;

import java.util.Objects;

public class LongestPalindromeSubstring
{

    public static String getLongestPalindromeSubstring(final String string)
    {
        if(Objects.isNull(string)){return null;}

        var longestPalindromeSubstring = "";
        var stringCharacterArray = string.toCharArray();

        for(char characterIndex = 0; characterIndex < string.length(); characterIndex++)
        {
            var localSubstring = String.valueOf(string.charAt(characterIndex));
            var localSubstringIsPalindrome = true;
            if(longestPalindromeSubstring.length() < 2)
            {
                longestPalindromeSubstring = localSubstring;
            }

            var palindromeSearchIncrementingCount = 1;
            while (localSubstringIsPalindrome && characterIndex - palindromeSearchIncrementingCount > -1 && characterIndex + palindromeSearchIncrementingCount < stringCharacterArray.length - 1)
            {
                final var nextLhsChar = String.valueOf(stringCharacterArray[characterIndex - palindromeSearchIncrementingCount]);
                final var nextRhsChar = String.valueOf(stringCharacterArray[characterIndex + palindromeSearchIncrementingCount]);
                if(nextLhsChar.equals(nextRhsChar))
                {
                    localSubstring = nextLhsChar + localSubstring + nextRhsChar;
                    if(localSubstring.length() > longestPalindromeSubstring.length())
                    {
                        longestPalindromeSubstring = localSubstring;
                    }
                    palindromeSearchIncrementingCount++;
                }
                else
                {
                    localSubstringIsPalindrome = false;
                }
            }
        }
        return longestPalindromeSubstring;
    }
}
