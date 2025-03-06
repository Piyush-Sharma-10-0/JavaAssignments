public class printPattern {
    public static void main(String [] args) {
        int row = 6;
        // Outer loop to print rows
        for(int i=1;i<=row;i++) {
            // inner loop to print spaces
            for(int j=1;j<=row-i;j++) {
                System.out.print(" ");
            }
            // inner loop to print first half of triangle
            for(int k=i;k>=1;k--)
                System.out.print(k);
            // inner loop to print next half of triangle
            for(int l=2;l<=i;l++)
                System.out.print(l);
            
            // For new line
            System.out.println();
        }

    }
}
