package quickSort;

public class QuickSort
{
    int[] array;
    QuickSort(){}
    QuickSort(int[] array) {
        this.array = array;
    }

    public int[] quickSort() {
        if (array == null) {
            return array;
        }
        int startIndex = 0;
        int endIndex = array.length - 1;
        return quickSort(array, startIndex, endIndex);
    }
    public int[] quickSort(int[] array, int lowIndex, int highIndex) {
        if ( lowIndex < highIndex) {
            int partitioningIndex = partition(array, lowIndex, highIndex);
            quickSort(array, lowIndex, partitioningIndex - 1);
            quickSort(array, partitioningIndex + 1, highIndex);
        }
        return array;
    }

    private int partition(int[] array, int lowIndex, int highIndex) {
        int pivot = array[highIndex];
        int lessThanPivot = lowIndex - 1;

        for(int i = lowIndex; i < highIndex; i++) {
            if (array[i] <= pivot) {
                lessThanPivot++;
                swap(array, i, lessThanPivot);
            }
        }

        swap(array, highIndex, lessThanPivot + 1);
        return lessThanPivot + 1;
    }

    private void swap(int[] array, int index, int low)
    {
        int temp;
        temp = array[index];
        array[index] = array[low];
        array[low] = temp;
    }

    public String toString()
    {
        StringBuilder output = new StringBuilder();
        int i = 0;
        while (i < array.length)
        {
            output.append("Array at index ").append(i).append(" - ").append(array[i]).append("\n");
            i++;
        }
        return output.toString();
    }
}