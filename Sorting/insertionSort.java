package Sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        insertion_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void insertion_Sort(int[] arr){
        for(int i=0;i<arr.length - 1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
