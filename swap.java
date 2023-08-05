// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;
public class swap {

    public static void swapValue(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(6);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(5);

        // int idx1 = 1, idx2 = 3;
        // swapValue(list, idx1, idx2);
        // for (Integer integer : list) {
        //   System.out.println(integer);
        // }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
