package org.toby.personal.codility.maximumslice;

public class MaxProfit
{
    public static int getMaxProfit(int[] sharePrices)
    {
        var maximumProfit = 0;
        for(var purchaseDayIndex = 0; purchaseDayIndex < sharePrices.length - 1; purchaseDayIndex++)
        {
            for(var sellDayIndex = purchaseDayIndex + 1; sellDayIndex < sharePrices.length; sellDayIndex++)
            {
                var profit = sharePrices[sellDayIndex] - sharePrices[purchaseDayIndex];
                maximumProfit = Math.max(maximumProfit, profit);
            }
        }
        return maximumProfit;
    }

    public static int getMax(int[] sharePrices)
    {
        if(sharePrices.length < 2) return 0; //for empty array or 1 element array, no profit can be realized

        //convert profit table to delta table so can use max slice technique
        int [] deltaA = new int[sharePrices.length];
        deltaA[0] = 0;
        for(int i=1; i<sharePrices.length; i++)
        {
            deltaA[i] = sharePrices[i] - sharePrices[i-1];
        }

        int absoluteMax = deltaA[0];
        int localMax = deltaA[0];
        int nextSum;
        int currentElement;

        for (int i = 1; i < deltaA.length; i++)
        {
            currentElement = deltaA[i];
            nextSum = localMax + currentElement;
            localMax = Math.max(deltaA[i], nextSum);
            absoluteMax = Math.max(absoluteMax, localMax);
        }
        return Math.max(absoluteMax, 0);
    }

}
