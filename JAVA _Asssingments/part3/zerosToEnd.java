import java.util.ArrayList;
public class zerosToEnd {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(0);
        array.add(0);
        array.add(0);
        array.add(6);

        System.out.println("Original array: "+array);

        int count=0;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i)==0) {
                array.remove(i--);
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            array.add(0);
        }
        System.out.println("Array after putting zeros to end: "+array);
    }
}