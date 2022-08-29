package hakkerrank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


    }


    //    Given a square matrix, calculate the absolute difference between the sums of its diagonals.
    public static Integer diagonalDifference(List<List<Integer>> arr) {

        Integer leftDioganal = 0;
        Integer rightDioganal = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i == j) {
                    leftDioganal += arr.get(i).get(j);
                }
                if (j == arr.size() - 1 - i) {
                    rightDioganal += arr.get(i).get(j);
                }
            }
        }
        if (leftDioganal < rightDioganal) {
            return -1 * (leftDioganal - rightDioganal);
        }

        return leftDioganal - rightDioganal;

    }

    public static List<Integer> reverseArray(List<Integer> arr) {

        for (int i = arr.size() - 1; i >= 0; i--) {
            arr.add(arr.remove(i));
        }

        return arr;
    }

    //    A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. Given
    //    an integer, d , rotate the array that many steps left and return the result.
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

        for (int i = 0; i < d; i++) {
            arr.add(arr.get(0));
            arr.remove(0);
        }

        return arr;
    }

    //    There is a collection of input strings and a collection of query strings. For each query string, determine
    //    how many times it occurs in the list of input strings. Return an array of the results.
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < queries.size(); i++) {
            results.add(0);
            Integer count = 0;
            for (int j = 0; j < strings.size(); j++) {
                if (queries.get(i).equals(strings.get(j))) {
                    count++;
                }
            }
            results.set(i, count);
        }

        return results;
    }


}

