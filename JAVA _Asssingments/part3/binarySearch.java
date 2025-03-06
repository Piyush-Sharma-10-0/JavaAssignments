import java.util.ArrayList;

public class binarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        // Binary Search Algorithm expects sorted array either in asc or desc
        for (int i = 0; i <= 10; i++) {
            array.add(i); // Intialzing asc sorted array
        }
        System.out.println("Original Sorted Arrray"+ array);
        // Binary Search using recursion
        int key = 3; 
        int result = binarySearchRecursion(array,key,0,array.size()- 1);
        
        if (result== -1) {
            System.out.println("Target "+key+ " not found in the array.");
        } 
        else {
            System.out.println("Target "+key+ " found at index: "+result);
        }
    }

    // Recursive binary search method
    public static int binarySearchRecursion(ArrayList<Integer> array,int key,int low,int high) {
        // Base case: if the range is invalid, key is not found
        if (low > high) {
            return -1;
        }

        // Calculate middle index
        int mid= low +(high-low)/2;
        // if key is at the middle
        if (array.get(mid) == key) 
            return mid;
        

        // If key is smaller than middle element, search the left half
        if (array.get(mid) > key)
            return binarySearchRecursion(array,key,low,mid - 1);
        
        // If key is larger than middle element, search the right half
        return binarySearchRecursion(array,key,mid + 1,high);


    }
}
