package org.toby.personal.codility.sort.algorithms;

public class QuickSort
{
    public static void quickSort(int[] array)
    {
        quickSort(array, 0, array.length - 1);
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int lowIndex, int highIndex)
    {
        int pivot = arr[highIndex];
        int indexBeforePivotInsert = lowIndex - 1;
        for (int j = lowIndex; j <= highIndex - 1; j++)
        {
            if (arr[j] < pivot)
            {
                indexBeforePivotInsert++;
                swap(arr, indexBeforePivotInsert, j);
            }
        }
        swap(arr, indexBeforePivotInsert + 1, highIndex);
        return indexBeforePivotInsert + 1;
    }

    static void swap(int[] arr, int i, int j)
    {
        if(i != j)
        {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
        }
    }
}
