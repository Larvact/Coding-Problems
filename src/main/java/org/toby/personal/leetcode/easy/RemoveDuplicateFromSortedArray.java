package org.toby.personal.leetcode.easy;

public class RemoveDuplicateFromSortedArray
{
    public int removeDuplicates(int[] nums)
    {
        var uniqueCount = 0;
        Integer currentNumber = null;
        for(var index = 0; index < nums.length; index++)
        {
            if(currentNumber == null || currentNumber != nums[index])
            {
                currentNumber = nums[index];
                nums[uniqueCount] = currentNumber;
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
