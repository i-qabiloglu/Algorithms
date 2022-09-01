package algorithms;

public class Main {

    public static void main(String[] args) {
        int[] arr = {16, 11, 7, 8, 2, 7, 14};

        insertionSort(arr);
        for (int num : arr) {
            System.out.println(num);
        }

    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] += arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] -= arr[j];
    }

    //time complexity- O(n^2), space Complexity- O(1)
    public static void selectionSort(int... numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            swap(numbers, i, minIndex);
        }
    }

    //time complexity- O(n^2)( min- O(n) ), space Complexity- O(1)
    public static void bubleSort(int... numbers) {

        boolean sorted = false;

        for (int i = 0; i < numbers.length - 1; i++) {
            sorted = true;
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
    }

    public static void insertionSort2(int... numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (numbers[j] < numbers[j + 1]) {
                    break;
                }
                swap(numbers, j, j + 1);
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }

    public static int fibonacci(int numIndex) {
        int prev = 1;
        int next = 1;

        for (int i = 3; i <= numIndex; i++) {
            next += prev;
            prev = next - prev;
        }
        return next;
    }

    public static int fiboRecursive(int numIndex) {
        if (numIndex < 2)
            return numIndex;

        return fiboRecursive(numIndex - 1) + fiboRecursive(numIndex - 2);
    }

    public static int binarySearch(int[] arr, int searchedElem) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (searchedElem == arr[mid]) {
                return mid;
            } else if (searchedElem > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }


}

