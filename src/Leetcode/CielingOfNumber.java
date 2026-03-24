package Leetcode;
// smallest element in array greater or = target arr = [1,4,6,8,10] target = 7 so 8 is answer.
public class CielingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int ans = cieling(arr , 15);
        System.out.println(ans);
    }

    static int cieling(int[] arr , int target){

        if(target > arr[arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
       // return start;
        return arr[start % arr.length];    // this is for array of index out of bound
    }
}