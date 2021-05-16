package insertionSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class insertionSortTest {
    int[] testArraySorted = { 1,2,3,4,5,6,7,8,9,10 };
    int[] testArrayEmpty = {};
    int[] testArrayUnsorted = { 7, 4, 8, 9, 2, 3, 4, 5, 6, 7, 2, 5, 2, 7, 5, 4, 7, 0 };
    int[] testArrayImbalanced = { 1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @Test
    public void insertionSort()
    {
        InsertionSort test = new InsertionSort();
        assertEquals("Should return an null.", null, test.insertionSort());
    }

    @Test
    public void insertionSort_SortedArray()
    {
        InsertionSort test = new InsertionSort(testArraySorted);
        int[] arrTest = {1,2,3,4,5,6,7,8,9,10};
        assertEquals("Return a sorted array.",Arrays.toString(arrTest),Arrays.toString(test.insertionSort()));
    }

    @Test
    public void insertionSort_UnsortedArray()
    {
        InsertionSort test = new InsertionSort(testArrayUnsorted);
        int[] arrTest = { 0, 2, 2, 2, 3, 4, 4, 4, 5, 5, 5, 6, 7, 7, 7, 7, 8, 9 };
        assertEquals("Return a sorted array.",Arrays.toString(arrTest),Arrays.toString(test.insertionSort()));

    }

    @Test
    public void insertionSort_ImbalancedArray()
    {
        InsertionSort test = new InsertionSort(testArrayImbalanced);
        int[] arrTest = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4};
        assertEquals("Return a sorted array.",Arrays.toString(arrTest),Arrays.toString(test.insertionSort()));

    }

    @Test
    public void insertionSort_EmptyArray()
    {
        InsertionSort test = new InsertionSort(testArrayEmpty);
        int[] arrTest = {};
        assertEquals("Return an empty array.",Arrays.toString(arrTest),Arrays.toString(test.insertionSort()));
    }



}
