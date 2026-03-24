package Leetcode;
// mountain array [1,2,3,4,5,3,1] target = 3 (3 exist in index 2 and 5 return minimum index which is 2)
public class LeetCode6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,8,9,10,5,3,1};
        int ans = search(arr , 3);
        System.out.println(ans);
    }
    static int search(int[] arr , int target){
        int peak = max(arr);
        int firstTry = orderAgnostic(arr , target , 0 , peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnostic(arr , target , peak+1 , arr.length-1);
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
    static int orderAgnostic(int[] arr , int target , int start , int end){
        boolean asc = arr[start] < arr[end];

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(asc){
                if(target<arr[mid]){
                    end = mid -1 ;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target>arr[mid]){
                    end = mid - 1 ;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
