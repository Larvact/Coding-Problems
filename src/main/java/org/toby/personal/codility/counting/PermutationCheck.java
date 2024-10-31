package org.toby.personal.codility.counting;

public class PermutationCheck
{
    public static int isPermutationValid(int[] permutation)
    {
        final var valueCount = new int[permutation.length];
        for(var value : permutation)
        {
            var index = value - 1;
            if(index > permutation.length - 1 || valueCount[index] > 0)
            {
                return 0;
            }
            valueCount[index] += 1;
        }
        return 1;
    }
}
