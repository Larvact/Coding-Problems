package org.toby.personal.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PalindromeInt
{
    public boolean isPalindrome(int number)
    {
        if(number < 0){return false;}
        List<Integer> digits = new ArrayList<>();
        while (number != 0)
        {
            digits.addFirst(number % 10);
            number = number / 10;
        }
        return isPalindrome(digits);

    }

    private boolean isPalindrome(final List<Integer> digits)
    {
        for(int index = 0; index < digits.size() / 2; index++)
        {
            if(!Objects.equals(digits.get(index), digits.get(digits.size() - 1 - index)))
            {
                return false;
            }
        }
        return true;
    }
}
