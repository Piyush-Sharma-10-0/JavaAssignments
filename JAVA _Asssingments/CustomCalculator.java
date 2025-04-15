import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
class MaxInputException extends Exception {
    public MaxInputException(String message) {
        super(message);
    }
}
class MaxMultiplierReachedException extends Exception {
    public MaxMultiplierReachedException(String message) {
        super(message);
    }
}
class CannotDivideByZeroException extends Exception {
    public CannotDivideByZeroException(String message) {
        super(message);
    }
}
class Calculator {
    private float num1, num2, result;
    private char operator, yes = 'Y';

    private float add(float num1,float num2) {
        return num1+num2;
    }
    private float sub(float num1,float num2) {
        return num1-num2;
    }
    private float mul(float num1,float num2) throws MaxMultiplierReachedException{
        if(num1>7000 || num2>7000){
            throw new MaxMultiplierReachedException("Input values must not exceed 7000 in multiplication.");
        }
        return num1*num2;
    }
    private float div(float num1,float num2) throws CannotDivideByZeroException {
        if(num2 == 0){

            throw new CannotDivideByZeroException("Divisor must not be 0.");
        }
        return num1/num2;
    }

    public void powerOn(){
        Scanner sc = new Scanner(System.in);
        while(yes == 'Y'||yes == 'y') {
            try {
                System.out.print("Enter first number: ");
                num1 = sc.nextFloat();
                System.out.print("Enter Operator(+,-,*,/): ");
                operator = sc.next().charAt(0);
                System.out.print("Enter second number: ");
                num2 = sc.nextFloat();

                if((num1==8 && num2==9) || (num1==9 && num2==8))
                    throw new InvalidInputException("Input values must not be combinations of 8 and 9.");
                if(num1>100000 || num2>100000)
                    throw new MaxInputException("Input values must <=100000");

                switch(operator) {
                    case '+':
                        result = add(num1,num2);
                        break;
                    case '-':
                        result = sub(num1,num2);
                        break;
                    case '*':
                        result = mul(num1,num2);
                        break;
                    case '/':
                        result = div(num1,num2);
                        break;
                    default:
                        System.out.println("Invalid Operator!!");
                        continue;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.nextLine(); // Clear buffer
                continue;
            }

            System.out.println(num1+" "+operator+" "+num2+" = "+result);
            System.out.print("Do you want to continue?? (Y/n): ");
            yes = sc.next().charAt(0);
            if(yes == 'n' || yes == 'N') {
                break;
            }
        }
        sc.close();
    }
}
public class CustomCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.powerOn();
    }
}
