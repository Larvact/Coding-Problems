package org.toby.personal.codility.stacksqueues;

import java.util.PriorityQueue;
import java.util.Queue;

public class Fish
{
    public static int getFishSurvivalCount(int[] fishSize, int[] fishDirection)
    {
        final Queue<Integer> queue = new PriorityQueue<>();
        for(var fish = 0; fish < fishSize.length; fish++)
        {
            queue.add(fish);
        }
        var numberOfFishKilled = 0;
        Integer currentFish = queue.poll();
        Integer activeFish = currentFish != null && fishDirection[currentFish] == 0 ? null : currentFish;
        while (currentFish != null)
        {
            if(activeFish == null && fishDirection[currentFish] == 1)
            {
                activeFish = currentFish;
            }
            else if (activeFish != null && fishDirection[currentFish] == 0)
            {
                if(fishSize[activeFish] < fishSize[currentFish])
                {
                    activeFish = null;
                }
                numberOfFishKilled += 1;
            }
            else if (activeFish != null && fishDirection[currentFish] == 1)
            {
                if(fishSize[activeFish] < fishSize[currentFish])
                {
                    activeFish = currentFish;
                }
            }
            currentFish = queue.poll();
        }
        return fishDirection.length - numberOfFishKilled;
    }
}
