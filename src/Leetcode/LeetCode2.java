package Leetcode;
// [[1,2] , [4,3] , [8,4]]  []--> bank acc so who are rich --> [8,4] ---> 12
public class LeetCode2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {4,3},
                {8,4}
        };
        int ans = maxWealth(arr);
        System.out.println(ans);
    }

    static int maxWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int[] nums : accounts){
            int sum = 0;
            for(int col : nums){
                sum = sum+col;
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
