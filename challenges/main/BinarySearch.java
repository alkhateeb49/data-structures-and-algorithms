public class BinarySearch {
  public static void main(String[] args){
    int[] inputArr = {4,8,15,16,23,42};
    System.out.println(BinarySearch(inputArr, 23));
  }

    public static int BinarySearch(int[] inputArray, int target) {
        int low = 0;
        int high = inputArray.length - 1;
        int current= -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (inputArray[mid] < target)
            low = mid + 1;
            else if (inputArray[mid] > target)
            high = mid - 1;
            else if (inputArray[mid] == target) {
                current = mid;
                break;
            }
        }
        return current;
    }
}