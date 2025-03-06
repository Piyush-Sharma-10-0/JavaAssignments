import java.util.ArrayList;
public class bubbleSort {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<> ();
        for (int i = 10; i > -1; i--) {
            array.add(i);
        }
        System.out.println("Original Array: "+ array);
        // Sorting using Bubble Sort
        // Time Complexity: O(N^2) [In worst case: elements in decending order]
        // Space Complexity: O(1)   [As only swap variable is required therefore constant space]
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.size()-i-1; j++) {
                if(array.get(j)> array.get(j+1)) {
                    int temp = array.get(j);
                    array.set(j,array.get(j+1));
                    array.set(j+1,temp);
                }
            }
        }
        System.out.println("Sorted Array: "+ array);
    }
}
