import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
        Set<Integer> set = new HashSet<>(arr);
        System.out.println(set);
    }
}
