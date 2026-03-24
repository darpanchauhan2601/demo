package Leetcode;
// rotated array pivot question
public class LeetCode7 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,10,0,1};
        int target = 6;
        System.out.println(pivot(arr , target));
    }

    static int pivot(int[] arr , int target){
        int pivot = findPivot(arr);
        if(arr[pivot] == target){
            return pivot;
        }
        if(pivot == -1){
           return binarySearch(arr , target , 0 ,arr.length - 1 );
        }
        if(target > arr[0]){
            return binarySearch(arr , target , 0 , pivot -1);
        }
        return binarySearch(arr , target , pivot + 1 ,arr.length - 1);
    }

    static int binarySearch(int[] arr , int target , int start , int end){

        while(start<=end){
            int mid = (start+end)/2;
            if(target<arr[mid]){
                end = mid -1 ;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length;

        while(start<=end){
            int mid = start + (end - start)/2;
            // 4 cases
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
