public class ArraysPractice {
    //Selection sort
    static void selectionSort(int[] arr) {
        int[] tempArr = new int[arr.length];
        int n = tempArr.length;
        //copy arr to tempArr
        if (n - 1 >= 0) System.arraycopy(arr, 0, tempArr, 0, n - 1);

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (tempArr[j] < tempArr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            tempArr[minIndex] = tempArr[i];
            tempArr[i] = temp;
        }
        printArray(tempArr);
    }



    static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("This is an array testing class");
        int[] testArray = new int[]{5, 6, 23, 6534, 1, 5, 7, 2, 6, 342};
        System.out.println("original array is: ");
        printArray(testArray);

        //Selection Sort Test
        System.out.println("sorting test array with selection sort: ");
        selectionSort(testArray);

        System.out.println("original array is: ");
        printArray(testArray);
        //Quick Sort Test
        System.out.println("sorting testArray with quickSort");
        printArray(ArraysQuickSort.copiedQuickSort(testArray));
    }
}
