package mergeSort;

public class MergeSort
{
    int[] array;

    MergeSort(){}

    MergeSort(int[] array) {
        this.array = array;
    }

    public int[] mergeSort() {
        return mergeSort(array);
    }

    public int[] mergeSort(int[] array) {
        if (array == null) {
            return array;
        }

        if ( array.length > 1) {
            int midPoint = array.length / 2;
            int[] left = new int[midPoint];
            int[] right = new int[array.length - midPoint];

            System.arraycopy(array, 0, left, 0, left.length);
            System.arraycopy(array, left.length, right, 0, right.length);

            mergeSort(left);
            mergeSort(right);
            merge(left, right, array);
        }
        return array;
    }

    private void merge(int[] arrayLeft, int[] arrayRight, int[] resultArray) {
        int leftIndex = 0;
        int rightIndex = 0;
        int arrayIndex = 0;

        while ((leftIndex < arrayLeft.length) && (rightIndex < arrayRight.length)) {
            if (arrayLeft[leftIndex] <= arrayRight[rightIndex]) {
                resultArray[arrayIndex] = arrayLeft[leftIndex];
                leftIndex++;
            }
            else {
                resultArray[arrayIndex] = arrayRight[rightIndex];
                rightIndex++;
            }
            arrayIndex++;
        }
        System.arraycopy(arrayLeft, leftIndex, resultArray, arrayIndex, arrayLeft.length - leftIndex);
        System.arraycopy(arrayRight, rightIndex, resultArray, arrayIndex, arrayRight.length - rightIndex);
    }

}
