package com.techie.Array;

public class CheckPairSum {
    public static void main(String[] args) {
        int arr[] = {4, 4, 3, 2, 6, 7, 1, 8, 9, 2};
       System.out.println( checkPairSum(arr, 11));
    }

    public static boolean checkPairSum(int arr[], int k) {
        int N = arr.length;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] + arr[j] == k) {
                    return true;
                }

            }
        }
        return false;
    }
}
