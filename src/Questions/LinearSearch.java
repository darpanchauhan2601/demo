package Questions;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int[][] arr1 = {
                {21,32,1},
                {7,44,322,90},
                {91,77,31,1}
        };

     //   boolean ans = linearSearch3(arr , -7);

        int[] ans = linearSearch5(arr1 , 44);
        System.out.println(Arrays.toString(ans));
    }

    static int linearSearch(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }

    static int linearSearch2(int[] arr , int target){
        for(int ele : arr) {
            if (ele == target) {
                return ele;
            }
        }
        return -1;
    }

    static boolean linearSearch3(int[] arr , int target){
        for(int ele : arr) {
            if (ele == target) {
                return true;
            }
        }
        return false;
    }
    static int linearSearch4(int[] arr , int target , int start , int end){
        if(arr.length ==0){
            return -1;
        }
        for(int i=start ; i<=end ; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
    static int[] linearSearch5(int[][] arr , int target){
        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                if(arr[row][col] == target){
                    return new int[]{row , col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
