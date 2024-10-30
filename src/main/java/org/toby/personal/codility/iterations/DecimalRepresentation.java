package org.toby.personal.codility.iterations;

public class DecimalRepresentation
{
    public static long countNumberOfDigitsInDecimalRepresentation(long number)
    {
        while (number != 0 && number % 10 == 0)
        {
            number = number/10;
        }
        long result = 0;
        while (number != 0)
        {
            result++;
            number = number/10;
        }
        return result;
    }
}
