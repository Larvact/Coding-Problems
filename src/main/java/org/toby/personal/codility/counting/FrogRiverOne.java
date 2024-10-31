package org.toby.personal.codility.counting;

public class FrogRiverOne
{
    public static int earlistTimeFrogCanMakeIt(int positionsToJump, int[] leafPositionAtSeconds)
    {
        var positionCount = new int[positionsToJump];
        var numberOfRequiredJumpsMade = 0;
        for(int seconds = 0; seconds < leafPositionAtSeconds.length; seconds++)
        {
            var leafPosition = leafPositionAtSeconds[seconds];
            if(leafPosition <= positionsToJump)
            {
                if(positionCount[leafPosition - 1] == 0)
                {
                    numberOfRequiredJumpsMade += 1;
                    if(numberOfRequiredJumpsMade == positionsToJump)
                    {
                        return seconds;
                    }
                }
                positionCount[leafPosition - 1] += 1;
            }
        }
        return -1;
    }
}
