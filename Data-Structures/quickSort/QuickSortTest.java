package quickSort;

import mergeSort.MergeSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class QuickSortTest {
    int[] testArraySorted = { 1,2,3,4,5,6,7,8,9,10 };
    int[] testArrayEmpty = {};
    int[] testArrayUnsorted = { 7, 4, 8, 9, 2, 3, 4, 5, 6, 7, 2, 5, 2, 7, 5, 4, 7, 0 };
    int[] testArrayImbalanced = { 1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };


    @Test
    public void mergeSort()
    {
        QuickSort test = new QuickSort();
        assertEquals("Should return an null.", null, test.quickSort());
    }

    @Test
    public void mergeSort_SortedArray()
    {
        QuickSort test = new QuickSort(testArraySorted);
        int[] arrTest = {1,2,3,4,5,6,7,8,9,10};
        assertEquals("Return a sorted array.", Arrays.toString(arrTest),Arrays.toString(test.quickSort()));
    }

    @Test
    public void mergeSort_UnsortedArray()
    {
        QuickSort test = new QuickSort(testArrayUnsorted);
        int[] arrTest = { 0, 2, 2, 2, 3, 4, 4, 4, 5, 5, 5, 6, 7, 7, 7, 7, 8, 9 };
        assertEquals("Return a sorted array.",Arrays.toString(arrTest),Arrays.toString(test.quickSort()));

    }

    @Test
    public void mergeSort_ImbalancedArray()
    {
        QuickSort test = new QuickSort(testArrayImbalanced);
        int[] arrTest = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4};
        assertEquals("Return a sorted array.",Arrays.toString(arrTest),Arrays.toString(test.quickSort()));

    }

    @Test
    public void mergeSort_EmptyArray()
    {
        QuickSort test = new QuickSort(testArrayEmpty);
        int[] arrTest = {};
        assertEquals("Return an empty array.",Arrays.toString(arrTest),Arrays.toString(test.quickSort()));
    }

}
