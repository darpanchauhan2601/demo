package Questions;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11,22,33,44,55,66};
        int target = 6;
        int ans = orderAgnostic(arr , target);
        System.out.println(ans);
    }
    static int orderAgnostic(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
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
