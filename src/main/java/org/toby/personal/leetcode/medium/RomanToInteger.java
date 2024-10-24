package org.toby.personal.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger
{
    private static final Map<Character, Integer> NUMERAL_INTEGER_MAP = new HashMap<>();

    static
    {
        NUMERAL_INTEGER_MAP.put('M', 1000);
        NUMERAL_INTEGER_MAP.put('D', 500);
        NUMERAL_INTEGER_MAP.put('C', 100);
        NUMERAL_INTEGER_MAP.put('L', 50);
        NUMERAL_INTEGER_MAP.put('X', 10);
        NUMERAL_INTEGER_MAP.put('V', 5);
        NUMERAL_INTEGER_MAP.put('I', 1);
    }

    public static int romanToInt(final String roman)
    {
        final var romanCharArray = roman.toCharArray();
        var result = NUMERAL_INTEGER_MAP.get(romanCharArray[roman.length() - 1]);
        for(var index = 0; index < roman.length() - 1; index++)
        {
            final var currentNumber = NUMERAL_INTEGER_MAP.get(romanCharArray[index]);
            final var nextNumber = NUMERAL_INTEGER_MAP.get(romanCharArray[index + 1]);
            if(nextNumber > currentNumber)
            {
                result = result - currentNumber;
            }
            else
            {
                result = result + currentNumber;
            }
        }
        return result;
    }
}
