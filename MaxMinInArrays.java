import java.lang.reflect.Array;
import java.util.Arrays;

class MaxMinInArrays {
    void maxarr(int arr[]) {
        int maxval = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        System.out.println(maxval);
    }

    void minvalue(int arr[]) {
        int minval = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minval) {
                minval = arr[i];
            }
        }
        System.out.println(minval);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 6, 2, 1, 7, 5, 9, 24, 21, 98, 5, 678 };
        MaxMinInArrays obj = new MaxMinInArrays();
        obj.maxarr(arr);
        obj.minvalue(arr);
    }
}
