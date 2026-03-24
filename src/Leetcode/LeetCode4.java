package Leetcode;
// find element in infinite sorted array

public class LeetCode4 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,10,12,14,15,20,23,25,27,30};
        int ans = ans(arr , 15);
        System.out.println(ans);
    }
    static int ans(int[] arr , int target){
        int start = 0;
        int end = 1;
        while(target >= arr[end]){
           int temp = end + 1;
           end = end + (end - start +1) * 2;
           start = temp;
        }
        return findTarget(arr , target , start , end);
    }
    static int findTarget(int[] arr , int target , int start , int end){

        while(start<=end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

