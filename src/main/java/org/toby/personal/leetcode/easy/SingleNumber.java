package org.toby.personal.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber
{
    public int singleNumber(int[] nums)
    {
        final Set<Integer> set = new HashSet<>();
        for (int num : nums)
        {
            if(set.contains(num))
            {
                set.remove(num);
            }
            else
            {
                set.add(num);
            }
        }
        return set.stream()
                .findAny()
                .get();
    }
}
