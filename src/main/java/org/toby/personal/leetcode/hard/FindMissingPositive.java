package org.toby.personal.leetcode.hard;

public class FindMissingPositive
{
    public static int firstMissingPositive(int[] nums)
    {
        //Do 1 first
        Integer oldValue = null;
        boolean isOneExist = false;
        for(int index = 0; index < nums.length; index++)
        {
            if(nums[index] == 1 && !isOneExist)
            {
                isOneExist = true;
            }
            else if (isOneExist && nums[index] == 1)
            {
                nums[index] = -1;
            }
        }

        for(int index = 0; index < nums.length; index++)
        {
            if(nums[index] == 1)
            {
                oldValue = nums[0];
                nums[0] = 1;
                while (oldValue > 1 && oldValue < nums.length + 1)
                {
                    final var registeredValue = nums[oldValue - 1];
                    nums[oldValue - 1] = 1;
                    oldValue = registeredValue;
                }
            }
        }

        //for int
        //if value is 1, negative or out of bounds then move on
        //else replace index with 1, be sure to save the old val, keep going until old value is 1?
        for(int index = 0; index < nums.length; index++)
        {
            if(nums[index] != 1)
            {
                oldValue = nums[index];
                while (oldValue > 1 && oldValue < nums.length + 1)
                {
                    final var registeredValue = nums[oldValue - 1];
                    nums[oldValue - 1] = 1;
                    oldValue = registeredValue;

                }
            }
        }

        //finally loop through the nums and find/return the index + 1 that i is not 1
        //return nums.length
        for(int index = 0; index < nums.length; index++)
        {
            if(nums[index] != 1)
            {
                return index + 1;
            }
        }
        return nums.length + 1;
    }
}
