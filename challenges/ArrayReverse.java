package code401challenges;

import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args){
    int[] RA = new int[]{1,2,3,4,5};
    System.out.println(Arrays.toString(reverseArray(RA)));
  }
    public static int[] reverseArray(int[] arr){
        if (arr.length <= 1) {
            return arr;
        } else {
            int arrLen = arr.length;
            int[] newArr = new int[arrLen];
            int z = 0;
            for(int i = arr.length-1;  i >= 0 ; i-- ){
                // System.out.println(arr[i]);
                newArr[z] = arr[i];
                z++;
            }
            return newArr;
        }
    }


}