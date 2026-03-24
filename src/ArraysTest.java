import java.util.Arrays;
import java.util.Scanner;

class ArraysTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("input 5 numbers");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
    }
}