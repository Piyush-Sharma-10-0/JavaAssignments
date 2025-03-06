import java.util.ArrayList;
import java.util.List;

public class transposeOfMatrix {
    public static void main(String [] args){
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(List.of(1,2,3));
        matrix.add(List.of(4,5,6));
        matrix.add(List.of(7,8,9));
        System.out.println("Original Matrix:");
        for(List<Integer> row : matrix) {
            for(Integer value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        // Transpose of the matrix 
        int rows = matrix.size();
        int cols = matrix.get(0).size();
        List<List<Integer>> transpose = new ArrayList<>();
        // Initialize the transpose matrix with empty lists
        for(int j=0; j< cols; j++) {
            transpose.add(new ArrayList<>());
        }
        for (int i =0 ; i<rows; i++) {
            for( int j = 0 ; j<cols; j++) {
                transpose.get(j).add(matrix.get(i).get(j));
            }
        }
        System.out.println("Transposed Matrix:");
        for (List<Integer> row : transpose) {
            for( Integer value: row) {
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}