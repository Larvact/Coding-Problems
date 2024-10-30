package org.toby.personal.codility.iterations;

public class Factorial
{
    public static long computeFactorialByIteration(final long number)
    {
        var result = 1;
        for(int num = 2; num <= number; num++)
        {
            result = result * num;
        }
        return result;
    }

    public static long computeFactorialByRecursion(final long number)
    {
        if(number < 2)
        {
            return 1;
        }
        return number * computeFactorialByRecursion(number - 1);
    }
}
