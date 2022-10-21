package Homework_2;

import java.util.Arrays;

public class insertionsort {    
    public static void insort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > element) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = element;
        }
    }
    public static void main(String[] args) {
        int[] array = {32, -11, 5, 69, 0, -2, 14, 99, 8, 8};
        System.out.println(Arrays.toString(array));
        insort(array);
        System.out.println(Arrays.toString(array));
    }
}
