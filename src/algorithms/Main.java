package algorithms;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {16, 11, 14, 8, 2, 7, 14};

        int[] arrRes = mergeSort(arr);
        for (int num : arrRes) {
            System.out.println(num);
        }

    }


    public static void swap(int[] arr, int i, int j) {
        arr[i] += arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] -= arr[j];
    }

    //time complexity- O(n^2), space complexity- O(1)
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

    //time complexity- O(n^2)( min- O(n) ), space complexity- O(1)
    public static void bubleSort(int... array) {

        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    sorted = false;
                }
            }
        }
    }

    //time complexity- O(n^2), space complexity- O(1)
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    // time complexity- O(nlog(n))(worst case- O(n^2)), space complexity- O(1)
    public static void quickSort(int[] arr, int beginIndex, int endIndex) {

        if (beginIndex >= endIndex)
            return;

        int pivot = endIndex;
        int counter = beginIndex;

        for (int i = beginIndex; i < endIndex; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, counter);
                counter++;
            }
        }

        swap(arr, counter, pivot);
        quickSort(arr, beginIndex, counter - 1);
        quickSort(arr, counter + 1, endIndex);
    }

    // time complexity- O(nlog(n)), space complexity- O(1) or O(n)
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1)
            return arr;

        int midPoint = arr.length / 2;
        int[] leftSortedArray = mergeSort(Arrays.copyOfRange(arr, 0, midPoint));
        int[] rightSortedArray = mergeSort(Arrays.copyOfRange(arr, midPoint, arr.length));

        return mergeSortedArrays(leftSortedArray, rightSortedArray);

    }

    public static int[] mergeSortedArrays(int[] arrFirst, int[] arrSecond) {
        int n1 = 0;
        int n2 = 0;
        int k = 0;
        int[] result = new int[arrFirst.length + arrSecond.length];

        while (n1 < arrFirst.length && n2 < arrSecond.length) {

            if (arrFirst[n1] < arrSecond[n2]) {
                result[k] = arrFirst[n1];
                n1++;
            } else {
                result[k] = arrSecond[n2];
                n2++;
            }
            k++;
        }

        while (n1 < arrFirst.length) {
            result[k] = arrFirst[n1];
            n1++;
            k++;
        }
        while (n2 < arrSecond.length) {
            result[k] = arrSecond[n2];
            n2++;
            k++;
        }

        return result;
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

    //time complexity- O(log(N)), space complexity- O(1)
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

