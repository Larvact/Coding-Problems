package org.toby.personal.codility.prefixsums;

public class PassingCars
{
    public static int getNumberOfPastCars(int[] cars)
    {
        var numberOfPasses = 0L;
        final var cumulativeWestTravelingCars = getPrefixSums(cars);
        for(int index = 0; index < cars.length; index++)
        {
            if(cars[index] == 0)
            {
                numberOfPasses += cumulativeWestTravelingCars[cars.length - 1] - cumulativeWestTravelingCars[index];
            }
        }
        return numberOfPasses > 1000000000 ? -1 : (int) numberOfPasses;
    }

    private static int[] getPrefixSums(int [] array)
    {
        final var sums = new int[array.length];
        var sum = 0;
        for(var index = 0; index < sums.length; index++)
        {
            sum += array[index];
            sums[index] = sum;
        }
        return sums;
    }
}
