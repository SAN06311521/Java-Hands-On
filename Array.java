package Arrays;

import java.util.*;

public class Array {

    public static void  display(int[] arr) {
        System.out.println("Elements of array are: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void minimum(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Smallest number in array is: " + min);
    }

    public static void maximum(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Largest number in array is: " + max);
    }

    public static void search(int[] arr, int search) {
        int n = arr.length;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("found at position: " + (i + 1));
                break;
            }
            if (i == (n - 1)) {
                System.out.println("Not found");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        display(arr);
        minimum(arr);
        maximum(arr);
        search(arr,3);
    }
}
