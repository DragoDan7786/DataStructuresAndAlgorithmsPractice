import java.util.Arrays;
import java.util.Random;

public class ArraysQuickSort {

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivotIndex = randomPartition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Method to partition the array using a random pivot and return the pivot index
    public static int randomPartition(int[] arr, int low, int high) {
        int pivotIndex = new Random().nextInt(high - low + 1) + low;
        swap(arr, pivotIndex, high);
        return partition(arr, low, high);
    }

    // Method to partition the array and return the pivot index
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    // Utility method to swap elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] copiedQuickSort(int[] arr) {
        // Create a copy of the original array
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        // Sort the copy
        quickSort(arrCopy, 0, arrCopy.length - 1);
        // Return the sorted copy
        return arrCopy;
    }

}
