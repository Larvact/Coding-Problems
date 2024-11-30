package org.toby.personal.leetcode.medium;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class ZigzagConversion
{
    public static String convertToZigZag(final String string, final int numRows)
    {
        if(Objects.isNull(string) || string.isBlank() || numRows == 0)
        {
            return "";
        }
        else if (numRows == 1)
        {
            return string;
        }
        final var resultArrays = new char[numRows][string.length()];
        boolean isIndexFullInsert = false;
        var insertionIndex = 0;
        var insertionArrayIndex = 0;
        for(int index = 0; index < string.length(); index++)
        {
            final var character = string.charAt(index);
            resultArrays[insertionArrayIndex][insertionIndex] = character;
            if(insertionArrayIndex % (numRows - 1) == 0)
            {
                isIndexFullInsert = !isIndexFullInsert;
            }
            if(isIndexFullInsert)
            {
                insertionArrayIndex = insertionArrayIndex + 1;
            }
            else
            {
                insertionArrayIndex = insertionArrayIndex - 1;
                insertionIndex += 1;
            }
        }
        return Arrays.stream(resultArrays)
                .map(String::valueOf)
                .map(s-> s.replaceAll("\\u0000", ""))
                .filter(arrayString -> !arrayString.isBlank())
                .collect(Collectors.joining());
    }
}
