/*
 * arrays.java
 * Topic: Array algorithms
 * Concepts: finding max/min, second largest, sum/average, reversing, sorting,
 * searching (linear & binary), removing duplicates, merging arrays, frequency map
 * How to run: javac arrays.java && java arrays
 * Notes: Collection of common array-related snippets implemented for learning.
 */
import java.util.*;

public class arrays {
    public static void main(String[] args) {

        // finding the maximum element in an array;

        int[] arr = { 5, 2, 8, 1, 9, 3, 4 };
        int max = arr[0];
        for (int i : arr) {
            max = Math.max(max, i);
        }
        System.out.println("The largest element in the array is " + max);

        // finding the minimum element in an array

        int min = arr[0];
        for (int i : arr) {
            min = Math.min(min, i);
        }
        System.out.println("The largest element in the array is" + min);

        // find the second largest element in the array

        int fMax = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > fMax) {
                sMax = fMax;
                fMax = arr[i];
            } else if (arr[i] > sMax) {
                sMax = arr[i];
            }
        }
        System.out.println("the largest Element in the array is " + fMax);
        System.out.println("the second largest Element in the array is " + sMax);

        // finding the sum and average of elements in the array
        int sum = 0;
        double avg = 0.0;
        int len = arr.length;
        System.out.println(len / 2);
        for (int i : arr) {
            sum += i;
        }
        avg = (double) sum / len;
        System.out.println("the sum of the elements of an array is " + sum);
        System.out.println("the avg of the elements of an array is " + avg);

        // reverse an array
        for (int i = 0; i < (arr.length / 2); i++) {
            int temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        // sort an array in ascending order

        int[] arr1 = { 1, 2, 3, 4, 7, 9, 8, 45, 10 };
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        for (int i : arr1) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] < arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        for (int i : arr1) {
            System.out.print(i + " ");
        }

        System.out.println();
        // search an element using linear search

        int target = 8;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == target) {
                System.out.println("the array is found at the index " + i);
                break;
            }
        }
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] arr3 = { 8, 7, 6, 5, 4, 3, 2, 1 };
        int t1 = 3;
        int ans = -1;
        int start = 0;
        int end = arr2.length - 1;

        // // for ascending order
        // while (start <= end) {
        // int mid = start + (end - start) / 2;
        // if (arr2[mid] == t1) {
        // ans = mid;
        // break;
        // } else if (arr2[mid] < t1) {
        // start = mid + 1;
        // } else {
        // end = mid - 1;
        // }
        // }
        // if (ans == -1) {
        // System.out.println("the element is not found");
        // } else {
        // System.out.println("the element is found at index " + ans);
        // }

        // for descending order
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr3[mid] == t1) {
                ans = mid;
                break;
            } else if (arr3[mid] < t1) {
                end = mid - 1;
            } else {
                start = start + 1;
            }
        }
        if (ans == -1) {
            System.out.println("the element is not found");
        } else {
            System.out.println("the element is found at index " + ans);
        }

        // remove duplicate elements from an array

        int[] arr4 = { 2, 5, 5, 1, 7, 7, 22, 33, 33, 8, 65 };
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i : arr4) {
            if (l1.isEmpty()) {// checks if the Arraylist is empty or not
                l1.add(i);// add the first elm if empty
            } else if (l1.contains(i) == true) {// check if the array contains the elm
                continue;// continue if already added
            } else {
                l1.add(i);// add the element
            }
        }
        System.out.println(l1);

        // Merging the two arrays together
        int[] a1 = { 1, 22, 3, 4, 5, 6, 27 };
        int[] a2 = { 4, 5, 44 };
        int[] a3 = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            a3[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            a3[a1.length + i] = a2[i];
        }
        for (int i : a3) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[] a4 = { 5, 43, 6, 234, 6, 23, 67, };
        int[] a5 = { 2, 3, 5, 23, 7, 83, 88 };
        int[] a6 = new int[a4.length + a5.length];

        System.arraycopy(a4, 0, a6, 0, a4.length);
        System.arraycopy(a5, 0, a6, a4.length, a5.length);

        for (int i : a6) {
            System.out.print(i + " ");
        }

        System.out.println();
        // find the freq of each element in an array

        int[] b1 = { 1, 2, 5, 6, 2, 3, 5, 4, 2, 6, 1, 9 };
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : b1) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        System.out.println(freq);

        for (Integer key : freq.keySet()) { 
            System.out.println("the elm is " + key + " " + "And its freq is " + freq.get(key));
        }
    }
}