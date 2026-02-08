package com.techie.Array;

 /*
      greter than Element 5 is 6,7,8
      greater than element 4 is 5,6,5,7,8
      gretaer than element 3 is 5,4,6,5,7,8
      ..
      greater than element 8 is Na
    Pseudocode
    ----------------------------------------------
      1. for max element 8 we cannot have max element, So find max element
      int max = arr[0];
      int N= max.length;
      for(int i=1;i<N;i++){
      if(arr[i]>max){
      max =arr[i]
      }
      }

      2.count max element occirence
      int count=0
      for(int i=0;i<N;i++)
      {
      if(arr[i]==max){
      count++;
      }
      }
      return N-count;

        */

public class AtLeastOneElementGreaterThan {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 6, 5, 7, 8, 1, 0};
        System.out.println("Greater than one time   " + CountElement(arr));
    }

    public static int CountElement(int arr[]) {
        int max = arr[0];
        int N = arr.length;

        for (int i = 1; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int count = 0;
        for (int j = 0; j < N; j++) {
            if (arr[j] == max) {
                count++;
            }
        }

        return N - count;
    }
}
