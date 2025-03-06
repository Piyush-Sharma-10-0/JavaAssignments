import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class conversion {
    public static void main(String[] args) {
        
        // Conversion of binary to decimal and vice versa
        int num = 12;
        int binary = 1100;
        int rem, i=0;
        List<Integer>remainder = new ArrayList<>();
        // Decimal to binary
        while(num!=0) {
            remainder.add(num%2);
            num = num/2;
        }
        Collections.reverse(remainder);
        System.out.println(remainder);
        num=0;
        // Binary to Decimal
        while(binary!=0) {
            rem = binary%10;
            binary/=10;
            num+=rem*Math.pow(2, i++);
            
            }
        System.out.println(num);
    }
}
