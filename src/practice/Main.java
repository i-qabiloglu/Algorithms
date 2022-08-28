package practice;

public class Main {

    public static void main(String[] args) {
        int[] arr = {56, 23, 42, -6, 32, 15, 69, 3};
        bubleSort(arr);

        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void bubleSort(int... numbers) {

        int temp;

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < numbers.length - i-1 ; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp           = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j]     = temp;
                }
            }
        }
    }
}
