package org.toby.personal.codility.leader;

public class EquiLeader
{
    public static int getEquiLeaderCount(int[] array)
    {
        final var leaderOptional = Leader.getLeaderValue(array);
        if(leaderOptional.isEmpty())
        {
            return 0;
        }
        final int leaderValue = leaderOptional.get();

        var equiLeaderCount = 0;
        var leftLeaderValueCount = 0;
        var rightLeaderValueCount = 0;

        for (int value : array)
        {
            if (value == leaderValue)
            {
                rightLeaderValueCount++;
            }
        }

        for(var index = 0; index < array.length; index++)
        {
            if(array[index] == leaderValue)
            {
                leftLeaderValueCount++;
                rightLeaderValueCount--;
            }
            if (rightLeaderValueCount > (array.length - index - 1)/2 && leftLeaderValueCount > (index + 1)/2)
            {
                equiLeaderCount++;
            }
        }
        return equiLeaderCount;
    }


}
