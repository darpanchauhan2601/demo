package Leetcode;
// Given an Array we have to in which element contains even number of digits
public class LeetCode1 {
    public static void main(String[] args) {
    int[] num = {12 , 456 , 4 , 7 , 4322};
        int ans = findNumber(num);
        System.out.println(ans);
    }
    static int findNumber(int[] arr){
        int count = 0;
        for(int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }
 //count number of digits
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
