package org.toby.personal.leetcode.hard;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysMedian
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        final var orderedList = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        orderedList.addAll(Arrays.stream(nums2).boxed().toList());
        orderedList.sort(Integer::compareTo);
        if(orderedList.size() % 2 !=0)
        {
            return orderedList.get(orderedList.size()/2);
        }
        else
        {
            return (orderedList.get(orderedList.size()/2) + orderedList.get((orderedList.size()/2) - 1))/2d;
        }
    }
}
