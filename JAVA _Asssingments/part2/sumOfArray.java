import java.util.ArrayList;
public class sumOfArray {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(4);
        array.add(6);
        array.add(7);
        array.add(9);
        
        int sum = 0;
        for(int i:array)
            sum+=i;
        System.out.println(array);
        System.out.println("SUM = "+sum);
    }
}
