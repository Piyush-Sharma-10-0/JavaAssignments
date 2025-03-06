public class factorial {
    public static void main(String[] args) {
        int num = 4;
        int factorial = 1;
        while(num!=1) {
            factorial *=num;
            num--;
        }
        System.out.println(factorial);
    }
}
