package algorithms;

public class Main {

    public static void main(String[] args) {

    }

    public static void bubleSort(int... numbers) {

        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    numbers[j] += numbers[j + 1];
                    numbers[j + 1] = numbers[j] - numbers[j + 1];
                    numbers[j] -= numbers[j + 1];
                }
            }
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

