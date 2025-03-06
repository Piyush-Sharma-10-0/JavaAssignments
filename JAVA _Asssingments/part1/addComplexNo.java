import java.util.Scanner;
class ComplexNumber {
    double real, imaginary;
    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    ComplexNumber add(ComplexNumber c) {
        double realSum= this.real+ c.real;
        double imaginarySum= this.imaginary+ c.imaginary;
        return new ComplexNumber(realSum, imaginarySum);
    }
    void display() {
        if(imaginary<0)
            System.out.println(real+"-"+Math.abs(imaginary)+"i");
        else
            System.out.println(real+"+"+imaginary+"i");
    } 
}
public class addComplexNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real then parts of first complex number");
        double real1=sc.nextDouble();
        double imaginary1=sc.nextDouble();
        System.out.println("Enter real then parts of second complex number");
        double real2=sc.nextDouble();
        double imaginary2=sc.nextDouble();

        ComplexNumber complex1 = new ComplexNumber(real1,imaginary1);
        ComplexNumber complex2 = new ComplexNumber(real2,imaginary2);

        ComplexNumber result = complex1.add(complex2);

        System.out.println("Sum of Complex Numbers: ");
        result.display();
        sc.close();


    }
}
