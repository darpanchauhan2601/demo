package Questions;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        swap(arr , 0 , 4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] nums , int index1 , int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            swap(arr , start , end);
            start++;
            end--;
        }
    }
}
