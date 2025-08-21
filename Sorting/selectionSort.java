package Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        selection_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection_Sort(int[] arr){
        for(int i=0;i < arr.length ;i++){
            int end = arr.length - 1 - i;
            int max = getMax(arr, 0, end);
            swap(arr,max,end);
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int getMax(int[] arr,int start,int end){
        int maxIndex = 0;
        for(int i=0;i<end;i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
