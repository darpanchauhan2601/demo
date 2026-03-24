package Questions;

public class Max {
    public static void main(String[] args) {
        int[] arr = {2,3,6,5,12,1};
        int[][] arr1 = {
                {21,32,1},
                {7,44,322,90},
                {91,77,31,1}
        };
        System.out.println(max2d(arr1));
    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] arr , int start , int end){
        int maxVal = arr[start];
        for(int i=start ; i<=end ; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int max2d(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] num : arr){
            for(int element : num){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }

    static int min(int[] arr){
        int minVal = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            if(minVal > arr[i]){
                minVal = arr[i];
            }
        }
        return minVal;
    }
}
