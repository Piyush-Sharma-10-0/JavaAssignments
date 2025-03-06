public class simpleInterest {
    public static void main(String[] args) {
        double principal = 1000, rate = 5, duration = 2; //Note: Rate of interest, here, is on yearly basis
        // Duration, here, is number of years
        double simpleInterest = (principal * rate * duration)/100;
        System.out.println(simpleInterest);
    }
}
