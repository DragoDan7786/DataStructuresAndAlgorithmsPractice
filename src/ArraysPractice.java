public class ArraysPractice {
    //Selection sort
    static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        System.out.println("This is an array testing class");
        int[] testArray = new int[]{5, 6, 23, 6534, 1, 5, 7, 2, 6, 342};
        //Selection Sort Test
        System.out.println("sorting test array with selection sort: ");
        selectionSort(testArray);
        //Quick Sort Test

    }
}
