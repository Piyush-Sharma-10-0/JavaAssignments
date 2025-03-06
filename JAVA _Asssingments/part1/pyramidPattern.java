public class pyramidPattern {
    public static void main(String[] args) {
        int row = 4;
        // Outer loop to print rows
        for(int i=1;i<=row;i++) {
            // inner loop to print spaces
            for(int j=1;j<=row-i;j++) {
                System.out.print(" ");
            }
            // inner loop to print stars
            for(int k=1;k<=2*i-1;k++)
                System.out.print("*");
            // For new line
            System.out.println();
        }
    }
}
