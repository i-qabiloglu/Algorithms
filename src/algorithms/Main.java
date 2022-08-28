package algorithms;

public class Main {

    public static void main(String[] args) {
        int[] arr = {99, 56, 0, 42, 6, 32, 32, 69, -7};
        bubleSort(arr);

        for (int num : arr) {
            System.out.println(num);
        }

//        System.out.println(fiboRecursive(15));
//        System.out.println(fibonacci(15));
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
}

