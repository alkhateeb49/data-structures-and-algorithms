package insertionSort;

public class InsertionSort {

    int[] array;
    InsertionSort(){}
    InsertionSort(int[] array) {
        this.array = array;
    }
    public int[] insertionSort() {
        if (array == null) {
            return array;
        }
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int temp = array[i];

            while ((j >= 0) && (temp < array[j])) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
        return array;
    }

}
