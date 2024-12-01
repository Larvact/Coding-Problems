package org.toby.personal.leetcode.medium;

public class ContainerMostWater
{
    public static int maxArea(int[] height)
    {
        var lhsPointer = 0;
        var rhsPointer = height.length - 1;
        var currentWidth = rhsPointer - lhsPointer;
        var maximumArea = currentWidth * Math.min(height[lhsPointer], height[rhsPointer]);

        while (currentWidth > 0)
        {
            final var lhsHeight = height[lhsPointer];
            final var rhsHeight = height[rhsPointer];
            final var minimumHeight = Math.min(lhsHeight, rhsHeight);
            final var localArea = minimumHeight * currentWidth;

            if(localArea > maximumArea)
            {
                maximumArea = localArea;
            }
            if(lhsHeight >= rhsHeight)
            {
                rhsPointer -= 1;
            }
            else
            {
                lhsPointer += 1;
            }
            currentWidth -= 1;
        }
        return maximumArea;
    }
}
