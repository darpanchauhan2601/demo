import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
//        list.add(90);
//        list.add(89);
//        list.add(79);
//        list.set(0 , 91);
//
//        System.out.println(list);

        for(int i = 0 ; i<5 ; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
