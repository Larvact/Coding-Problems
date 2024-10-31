package org.toby.personal.codility.timecomplexity;

public class TapeEquilibrium
{
    public static int getTapeEquilibrium(int[] tape)
    {
        long rightHandSide = 0L;
        for(var value : tape)
        {
            rightHandSide += value;
        }
        long leftHandSide = tape[0];
        rightHandSide = rightHandSide - tape[0];
        long result = Math.abs(leftHandSide - (rightHandSide));

        for(var index = 1; index < tape.length - 1; index++)
        {
            var currentValue = tape[index];
            leftHandSide += currentValue;
            rightHandSide -= currentValue;
            var difference = Math.abs(leftHandSide - rightHandSide);
            if(difference == 0){return 0;}
            else if (difference < result)
            {
                result = difference;
            }
        }
        return (int) result;
    }
}
