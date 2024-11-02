package org.toby.personal.codility.leader;

import java.util.Optional;

import static org.toby.personal.codility.leader.Leader.getLeaderValue;

public class Dominator
{
    public static int getFirstDominatorIndex(int[] array)
    {
        return getLeaderValue(array)
                .flatMap(dominatorValue -> getFirstIndexOfValue(array, dominatorValue))
                .orElse(-1);
    }

    private static Optional<Integer> getFirstIndexOfValue(int[] array, Integer value)
    {
        for(var index = 0; index < array.length; index++)
        {
            if(array[index] == value)
            {
                return Optional.of(index);
            }
        }
        return Optional.empty();
    }
}
