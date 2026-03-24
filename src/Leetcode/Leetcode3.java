package Leetcode;
// find first and last position of element in sorted array arr = [5,7,7,7,8,8,10]  target = 8  so ans = [4,5]
import java.util.*;
public class Leetcode3 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int first = search(arr , 8 , true);
        int last = search(arr , 8 , false);
        System.out.println(Arrays.toString(new int[]{first , last}));
    }

    static int search(int[] arr, int target , boolean findFirst) {
       int start = 0;
       int end = arr.length - 1;
       int ans = -1;

       while(start <= end){

           int mid = start + (end - start)/2;
           if(target > arr[mid]){
               start = mid + 1;
           } else if (target < arr[mid]) {
               end = mid - 1;
           } else {
               ans = mid;
               if(findFirst){
                   end = mid - 1;
               } else{
                   start = mid + 1;
               }
           }
       }
       return ans;
    }
}
