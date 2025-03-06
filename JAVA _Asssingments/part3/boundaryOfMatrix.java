import java.util.List;
import java.util.ArrayList;

public class boundaryOfMatrix {
    public static void main(String[] args) {
        ArrayList<List<Integer>> matrix = new ArrayList<>();
        // Initializing Matrix
        for (int i = 1; i <= 16; i += 4 ) {
            matrix.add(List.of(i,i+1,i+2,i+3));
        }
        // Printing Matrix
        System.out.println(matrix);

        // Logic to print boundary elements of matrix
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(0).size(); j++) {
                if (i==0 || j==0 || i==3 || j==3){
                    System.out.print(matrix.get(i).get(j) + "  ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}