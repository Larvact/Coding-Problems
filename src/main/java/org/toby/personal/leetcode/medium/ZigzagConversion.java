package org.toby.personal.leetcode.medium;

import java.util.Objects;

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
        final int rowSize = (int) Math.ceil((double)string.length()/((2 * numRows) - 2)) * (numRows - 1);
        final var resultArrays = new char[numRows][rowSize];
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
        final var resultBuilder = new StringBuilder();
        for(int currentArrayIndex = 0; currentArrayIndex < numRows; currentArrayIndex++)
        {
            for (int currentValueIndex = 0; currentValueIndex < rowSize; currentValueIndex++)
            {
                if(resultArrays[currentArrayIndex][currentValueIndex] != '\u0000')
                {
                    resultBuilder.append(resultArrays[currentArrayIndex][currentValueIndex]);
                }
            }
        }
        return resultBuilder.toString();
    }
}
