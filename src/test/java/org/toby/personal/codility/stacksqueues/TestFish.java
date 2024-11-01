package org.toby.personal.codility.stacksqueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestFish
{
    @Test
    void testGetFishSurvivalCount()
    {
        final var fishSizeArray = new int[5];
        fishSizeArray[0] = 4;
        fishSizeArray[1] = 3;
        fishSizeArray[2] = 2;
        fishSizeArray[3] = 1;
        fishSizeArray[4] = 5;
        final var fishDirectionArray = new int[5];
        fishDirectionArray[0] = 0;
        fishDirectionArray[1] = 1;
        fishDirectionArray[2] = 0;
        fishDirectionArray[3] = 0;
        fishDirectionArray[4] = 0;

        Assertions.assertEquals(2, Fish.getFishSurvivalCount(fishSizeArray, fishDirectionArray));
    }
}