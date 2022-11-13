package Homework_4;
import java.util.Arrays;

public class QS {

    public static void QuickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int mid = low + (high - low) / 2;
        int pivot = array[mid];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
            if (low < j)
            QuickSort(array, low, j);

            if (high > i)
            QuickSort(array, i, high);
    }
    public static void main(String[] args) {
        int[] array = {32, -11, 5, 69, 0, -2, 14, 99, 8, 8};
        int low = 0;
        int high = array.length - 1;

        System.out.println(Arrays.toString(array));
        QuickSort(array, low, high);
        System.out.println(Arrays.toString(array));
    }
}