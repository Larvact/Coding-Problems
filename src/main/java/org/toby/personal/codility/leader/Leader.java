package org.toby.personal.codility.leader;

import java.util.Optional;

public class Leader
{
    public static Optional<Integer> getLeaderValue(int[] array)
    {
        var stackSize = 0;
        Integer potentialDominatorValue = null;
        for (int value : array)
        {
            if (stackSize == 0)
            {
                stackSize += 1;
                potentialDominatorValue = value;
            }
            else
            {
                if (potentialDominatorValue != value)
                {
                    stackSize -= 1;
                }
                else
                {
                    stackSize += 1;
                }
            }
        }
        if(stackSize == 0)
        {
            return Optional.empty();
        }
        var potentialDominatorCount = 0;
        for(var value : array)
        {
            if(potentialDominatorValue == value)
            {
                potentialDominatorCount++;
            }
        }
        return potentialDominatorCount > array.length/2 ? Optional.of(potentialDominatorValue) : Optional.empty();
    }
}
