import java.util.ArrayList;

public class arrayRotation {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int d = 2 ; // Rotation factor
        for(int i = 1; i<=7;i++)
            arr.add(i);
        System.out.println("Original Array:");
        System.out.println(arr);


        // Appending at last
        for(int j = 0 ; j<d ; j++) 
            arr.add(arr.get(j));
        // Removing from front
        for(int k=0; k<d;k++)
            arr.remove(0);
            
        System.out.println("Rotated Array:");
        System.out.println(arr);
    }
}
