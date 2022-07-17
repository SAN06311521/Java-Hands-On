package Arrays;//given an array, find if there exists a sub array with sum equals to zero

import java.util.*;

public class ZeroSumSubArray {
    public static void main(String[] args) {
        int[] a = {2, 1, -3, 4, 2};
        boolean found = false;
        //brute force solution
//        for(int i = 0; i < a.length; i++) {
//            int sum = 0;
//            for(int j = i; j < a.length; j++) {
//                sum += a[j];
//                if(sum == 0) {
//                    found = true;
//                    break;
//                }
//            }
//            if( found ) {
//                break;
//            }
//        }

        //optimized method using set having o of n times time complexity
        Set<Integer> s = new HashSet<>();
        int sum = 0;
        for(int element : a) {
            s.add(sum);
            sum += element;
            if(s.contains(sum)) {
                found = true;
                break;
            }
        }
        System.out.println("Sub array is found : " + found);
    }
}
