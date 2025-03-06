import java.util.ArrayList;
import java.util.List;

public class computeDiagonals {
    public static void main(String[] args) {
        ArrayList<List<Integer>> matrix = new ArrayList<>();
        matrix.add(List.of(1,2,-3));
        matrix.add(List.of(4,5,6));
        matrix.add(List.of(7,8,-9));

        int sum1 = 0, sum2 = 0; // Sum variable to store for both diagonals 

        // Printing the matrix
        System.out.println("Matrix: ");
        for(List<Integer> row : matrix) {
            for(Integer value : row) {
                System.out.print(value + " "); // For printing values of Matrix 
            }
            System.out.println(); // For printing new line
        }
        for (int i = 0; i < matrix.size(); i++) {
            // matrix.size() returns number of rows 
            for (int j = 0; j < matrix.get(0).size(); j++) {
                // matrix.get(0).size() returns number of columns of first row
                if(i==j)
                    sum1+=matrix.get(i).get(j);
                if(i+j==matrix.get(0).size()-1)
                    sum2+=matrix.get(i).get(j);
            }
            
        }
        // Primary Diagonal is the one with higher sum and another is called Secondary Diagonal
        if(sum1>=sum2) {
            System.out.println("Primary Diagonal: "+ sum1);
            System.out.println("Secondary Diagonal: "+ sum2);
        }
        else {
            System.out.println("Primary Diagonal: "+ sum2);
            System.out.println("Secondary Diagonal: "+ sum1);
        }
    }
}
