import java.util.Arrays;

public class heapsort {

    public static void heapify(int[] array, int i, int size) {
          int leftnum = i * 2;
          int rightnum = i * 2 + 1;
          int maxx = i;
          
          if(leftnum < size && array[leftnum] > array[maxx])
            maxx = leftnum;
          if(rightnum < size && array[rightnum] > array[maxx])
            maxx = rightnum;

          if(i != maxx){
            int temp = array[i];
            array[i] = array[maxx];
            array[maxx] = temp;

            heapify(array, maxx, size);
          }
    }

    public static void heapSort(int []array) {
        int size = array.length;
        for(int i = size / 2 - 1; i >= 0; i-- )
        heapify(array, i, size);
        

        for(int i = size - 1; i >= 0; i--){
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            heapify(array, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] array = {32, -11, 5, 69, 0, -2, 14, 99, 8, 8};
        
        System.out.println(Arrays.toString(array));
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
    
    
}