import java.util.ArrayList;

public class removeOccurences {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int key = 1;
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(1);
        System.out.println(arr);
        // if key found remove it and go to next but because next element is now in key's index so index--.
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)==key) {
                arr.remove(i);
                i--;
            }
        }
        System.out.println("After removal");
        System.out.println(arr);
    }
}
