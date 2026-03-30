package Leetcode;
// nums = [3,0,1] output = 2 , explanation n=3 since there are 3 number in the range on [0,3]
public class LeetCode8 {
    public static void main(String[] args) {
        int[] arr = {2,0,1};
        int ans = find(arr);
        System.out.println(ans);
    }

    static int find(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // missing number check
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}