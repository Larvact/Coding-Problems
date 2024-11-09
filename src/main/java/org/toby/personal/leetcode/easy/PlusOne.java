package org.toby.personal.leetcode.easy;

public class PlusOne
{
    public static int[] plusOne(int[] digits)
    {
        var currentCopyIndex = digits.length - 1;
        while (currentCopyIndex > -1 && digits[currentCopyIndex] == 9)
        {
            digits[currentCopyIndex] = 0;
            currentCopyIndex --;
        }
        if(currentCopyIndex > -1)
        {
            digits[currentCopyIndex] = digits[currentCopyIndex] + 1;
            return digits;
        }
        else
        {
            final var newDigitArray = new int[digits.length + 1];
            System.arraycopy(digits, 0, newDigitArray, 1, digits.length);
            newDigitArray[0] = 1;
            return newDigitArray;
        }
    }
}
