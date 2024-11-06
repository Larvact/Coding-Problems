package org.toby.personal.leetcode.easy;

public class SearchInsertPosition
{
    public static int searchInsert(int[] nums, int target)
    {
        var lowIndex = 0;
        var highIndex = nums.length - 1;
        while (lowIndex <= highIndex)
        {
            final var middleIndex = lowIndex +  (highIndex - lowIndex) / 2;
            int midNumber = nums[middleIndex];
            if (target < midNumber)
            {
                highIndex = middleIndex - 1;
            }
            else if (target > midNumber)
            {
                lowIndex = middleIndex + 1;
            }
            else
            {
                return middleIndex;
            }
        }
        return lowIndex;
    }
}
