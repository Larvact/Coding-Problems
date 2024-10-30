package org.toby.personal.codility.iterations;

public class BinaryCalculator
{
    public static int getMaximumBinaryGap(int number)
    {
        final var binaryRepresentation = getBinaryRepresentation(number);
        var maximumBinaryGap = 0;
        var currentBinaryGap = 0;
        final var binaryRepresentationArray = binaryRepresentation.toCharArray();
        for(int index = 0; index < binaryRepresentationArray.length; index++)
        {
            final var binaryValue = binaryRepresentationArray[index];
            if(binaryValue == '0')
            {
                currentBinaryGap++;
            }
            else
            {
                if(maximumBinaryGap < currentBinaryGap)
                {
                    maximumBinaryGap = currentBinaryGap;
                }
                if(maximumBinaryGap >= binaryRepresentationArray.length - index - 1)
                {
                    return maximumBinaryGap;
                }
                currentBinaryGap = 0;
            }
        }
        return maximumBinaryGap;
    }

    public static String getBinaryRepresentation(int number)
    {
        var binaryRepresentation = new StringBuilder();
        final var isNegative = number < 0;
        while (number != 0)
        {
            if(number % 2 == 0)
            {
                binaryRepresentation.insert(0,"0");
            }
            else
            {
                binaryRepresentation.insert(0, "1");
            }
            number = number/2;
        }
        return determineBinarySign(isNegative, binaryRepresentation.toString());
    }

    private static String determineBinarySign(final boolean isNegative, String binaryRepresentation)
    {
        if(isNegative)
        {
            if(binaryRepresentation.charAt(0) == '0')
            {
                return "1" + binaryRepresentation.substring(1);
            }
            else
            {
                return "1" + binaryRepresentation;
            }
        }
        return binaryRepresentation;
    }
}
