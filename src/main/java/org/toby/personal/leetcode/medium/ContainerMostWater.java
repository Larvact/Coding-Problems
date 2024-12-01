package org.toby.personal.leetcode.medium;

public class ContainerMostWater
{
    public static int maxArea(int[] height)
    {
        var maximumArea = 0;
        for(int lineFromRight = height.length - 1; lineFromRight > 0; lineFromRight--)
        {
            for(int lineFromLeft = 0; lineFromLeft < lineFromRight; lineFromLeft++)
            {
                final var smallestLine = Math.min(height[lineFromLeft], height[lineFromRight]);
                final var area = smallestLine * Math.abs(lineFromRight - lineFromLeft);
                if(area > maximumArea)
                {
                    maximumArea = area;
                }
            }
        }
        return maximumArea;
    }
}
