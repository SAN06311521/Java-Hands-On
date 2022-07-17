package Arrays;

public class ReverseArray {
    static void reverseArray(int[] arr, int start, int end) {
        int temp;
        if(start >= end) {
            return;
        }
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr,start+1,end-1);
    }

    static void printArray(int[] arr, int size) {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 7, 9};
        reverseArray(arr,0,5);
        printArray(arr,6);
    }
}
