package Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        bubble_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble_Sort(int[] nums){
        for(int i=0;i<nums.length;i++){
            boolean swapped = false;
            for(int j=1;j<nums.length-i;j++){
                if(nums[j] < nums[j-1]){
                    swap(nums,j,j-1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
