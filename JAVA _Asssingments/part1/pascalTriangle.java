public class pascalTriangle {
    public static void main(String[] args) {
        int row = 8;
        for (int i = 0; i < row; i++) {
            int value = 1; // As first element is always 1
            for (int j = 0; j < row-i; j++) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                
                System.out.print(value+" ");
                value = value*(i-j)/(j+1); 
            }
            System.out.println();
        }
    }
}