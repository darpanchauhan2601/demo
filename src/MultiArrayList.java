import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            ArrayList<Integer> inner = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                inner.add(in.nextInt());
            }

            list.add(inner);
        }

        System.out.println(list);
    }
}