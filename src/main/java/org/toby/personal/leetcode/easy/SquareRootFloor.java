package org.toby.personal.leetcode.easy;

public class SquareRootFloor {

    private static final int MAXIMUM_RESULT_BOUND_BY_MAX_INT = 46340;

    public static int mySqrt(int x) {
        for(int numberToSquare = determineStartingNumber(x); numberToSquare <= MAXIMUM_RESULT_BOUND_BY_MAX_INT; numberToSquare++)
        {
            if (numberToSquare * numberToSquare > x)
            {
                return numberToSquare - 1;
            }
        }
        return MAXIMUM_RESULT_BOUND_BY_MAX_INT;
    }

    private static int determineStartingNumber(int x){
        int numberToSquare = 1;
        while (numberToSquare * numberToSquare < x && numberToSquare < MAXIMUM_RESULT_BOUND_BY_MAX_INT){
            numberToSquare *= 10;
        }
        return numberToSquare/10;
    }
}
