package org.toby.personal.leetcode.medium;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class ZigzagConversion
{
    public static String convertToZigZag(final String string, final int rowNum)
    {
        if(Objects.isNull(string) || string.isBlank() || rowNum == 0)
        {
            return "";
        }
        //create rowNum arrays
        final var resultArrays = new char[rowNum][string.length()];

        //flag when insert index is 0
        boolean isIndexFullInsert = true;
        //track what array we are on
        var insertionIndex = 0;
        var insertionArrayIndex = 0;
        //for letter in string
        for(int index = 0; index < string.length(); index++)
        {
            final var character = string.charAt(index);
            resultArrays[insertionArrayIndex][insertionIndex] = character;
            insertionIndex += 1;
        }


        return Arrays.stream(resultArrays)
                .map(String::valueOf)
                .filter(arrayString -> !arrayString.isBlank())
                .collect(Collectors.joining());
    }
}

/*
            if(insertionArrayIndex % (rowNum - 1) == 0)
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
            }
 */
