package Leetcode;
// mountain array arr = [1,5,8,11,7,6,3,2] (no duplicates) find peak of this array  ans = 11
public class LeetCode5 {
    public static void main(String[] args) {
        int[] arr = {1,5,8,11,7,6,3,2 };
        int ans = max(arr);
        System.out.println(ans);
    }
    static int max(int[] arr){
       int start = 0;
       int end = arr.length - 1;

       while(start < end){
           int mid = start + (end - start)/2;
           if(arr[mid] < arr[mid + 1]){
               start = mid + 1;
           } else {
               end = mid;
           }
       }
       return start;
    }
}
