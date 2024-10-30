package org.toby.personal.codility.arrays;

public class ReverseArray
{
    public static <T> void reverseArray(T[] array)
    {
        for(int index = 0; index < array.length/2; index++)
        {
            final T temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - index - 1] = temp;
        }
    }
}
