package org.toby.personal.codility.timecomplexity;

public class FrogJump
{
    public int getFrogJumpCount(int initialPosition, int requiredPosition, int jumpDistance)
    {
        return (int) Math.ceil((double) (requiredPosition - initialPosition)/jumpDistance);
    }
}
