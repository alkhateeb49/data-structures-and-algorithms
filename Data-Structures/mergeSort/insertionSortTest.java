package mergeSort;

import insertionSort.InsertionSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {
    int[] testArraySorted = { 1,2,3,4,5,6,7,8,9,10 };
    int[] testArrayEmpty = {};
    int[] testArrayUnsorted = { 7, 4, 8, 9, 2, 3, 4, 5, 6, 7, 2, 5, 2, 7, 5, 4, 7, 0 };
    int[] testArrayImbalanced = { 1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @Test
    public void mergeSort()
    {
        MergeSort test = new MergeSort();
        assertEquals("Should return an null.", null, test.mergeSort());
    }

    @Test
    public void mergeSort_SortedArray()
    {
        MergeSort test = new MergeSort(testArraySorted);
        int[] arrTest = {1,2,3,4,5,6,7,8,9,10};
        assertEquals("Return a sorted array.", Arrays.toString(arrTest),Arrays.toString(test.mergeSort()));
    }

    @Test
    public void mergeSort_UnsortedArray()
    {
        MergeSort test = new MergeSort(testArrayUnsorted);
        int[] arrTest = { 0, 2, 2, 2, 3, 4, 4, 4, 5, 5, 5, 6, 7, 7, 7, 7, 8, 9 };
        assertEquals("Return a sorted array.",Arrays.toString(arrTest),Arrays.toString(test.mergeSort()));

    }

    @Test
    public void mergeSort_ImbalancedArray()
    {
        MergeSort test = new MergeSort(testArrayImbalanced);
        int[] arrTest = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4};
        assertEquals("Return a sorted array.",Arrays.toString(arrTest),Arrays.toString(test.mergeSort()));

    }

    @Test
    public void mergeSort_EmptyArray()
    {
        MergeSort test = new MergeSort(testArrayEmpty);
        int[] arrTest = {};
        assertEquals("Return an empty array.",Arrays.toString(arrTest),Arrays.toString(test.mergeSort()));
    }


}
