package org.toby.personal.codility.prefixsums;

public class CountDiv
{
    public static int getDivisibleNumbersCountWithinBoundary(int numberOne, int numberTwo, int divisor)
    {
        final var initialRemainder = numberOne % divisor;
        var currentDivisibleNumber = numberOne + initialRemainder;
        var divisibleNumberCount = 0;

        //current div + n*divisor = numbertwo
        while (currentDivisibleNumber <= numberTwo)
        {
            divisibleNumberCount++;
            currentDivisibleNumber += divisor;
        }
        return divisibleNumberCount;
    }

    public static int getDivisibleNumbersCountWithinBoundaryOptimised(int numberOne, int numberTwo, int divisor)
    {
        var firstDivisibleNumber = numberOne % divisor == 0 ? numberOne : numberOne < divisor ? divisor : numberOne + (divisor - (numberOne % divisor));
        if(firstDivisibleNumber > numberTwo)
        {
            return 0;
        }
        return (int) Math.floor((double) (numberTwo - firstDivisibleNumber) /divisor) + 1;
    }
}
