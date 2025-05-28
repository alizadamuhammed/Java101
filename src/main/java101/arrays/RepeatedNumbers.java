package main.java101.arrays;

import java.util.Arrays;

public class RepeatedNumbers {
    static boolean isFind(int[] arr, int value){
        for (int i: arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int[] duplicate = new int[arr.length];
        int startIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && (arr[i] == arr[j])) {
                    if (!   isFind(duplicate, arr[i])){
                        duplicate[startIndex++] = arr[i];
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}
