package org.toby.personal.leetcode.medium;

import java.util.*;

public class IntegerToRoman
{
    private static final Map<Integer, String> INTEGER_NUMERAL_MAP = new TreeMap<>();
    private static final List<Integer> INTEGER_LIST;

    static
    {
        INTEGER_NUMERAL_MAP.put(1000, "M");
        INTEGER_NUMERAL_MAP.put(900, "CM");
        INTEGER_NUMERAL_MAP.put(500, "D");
        INTEGER_NUMERAL_MAP.put(400, "CD");
        INTEGER_NUMERAL_MAP.put(100, "C");
        INTEGER_NUMERAL_MAP.put(90, "XC");
        INTEGER_NUMERAL_MAP.put(50, "L");
        INTEGER_NUMERAL_MAP.put(40, "XL");
        INTEGER_NUMERAL_MAP.put(10, "X");
        INTEGER_NUMERAL_MAP.put(9, "IX");
        INTEGER_NUMERAL_MAP.put(5, "V");
        INTEGER_NUMERAL_MAP.put(4, "IV");
        INTEGER_NUMERAL_MAP.put(1, "I");
        INTEGER_LIST = INTEGER_NUMERAL_MAP.keySet().stream().sorted(Comparator.reverseOrder()).toList();
    }

    public static String intToRoman(int num)
    {
        final var lowerBoundedKey = getLowerBoundedKey(num);
        if(num == lowerBoundedKey)
        {
            return INTEGER_NUMERAL_MAP.get(num);
        }
        return INTEGER_NUMERAL_MAP.get(lowerBoundedKey) + intToRoman(num - lowerBoundedKey);
    }

    private static int getLowerBoundedKey(int num)
    {
        for(final var number : INTEGER_LIST)
        {
            if(num >= number)
            {
                return number;
            }
        }
        return 0;
    }
}
