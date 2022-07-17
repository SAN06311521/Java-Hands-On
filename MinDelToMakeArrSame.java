package Arrays;

import java.util.*;

public class MinDelToMakeArrSame {
    static int minDel(int arr[], int n) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        int max_freq = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            max_freq = Math.max(max_freq, entry.getValue());
        }
        return n-max_freq;
    }

    public static void main(String[] args) {
        int arr[] = {4, 4, 2, 4, 6, 4, 4};
        int n = arr.length;
        System.out.println("Answer : " + minDel(arr, n));
    }
}
