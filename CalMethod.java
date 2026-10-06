import java.util.Scanner;

public class CalMethod {

    static int add(int a, int b) {

        return a + b;
    }
    static int subtract(int a, int b) {
        return a - b;
    }


    static int multiply(int a, int b) {
        return a * b;
    }
    static int divide(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");

        int first = input.nextInt();
        System.out.print("Enter second number: ");

        int second = input.nextInt();
        System.out.println("Addition = " + add(first, second));
        System.out.println("Subtraction = " + subtract(first, second));
        System.out.println("Multiplication = " + multiply(first, second));

        if (second != 0) {

            System.out.println("Division = " + divide(first, second));
        } else {
            System.out.println("Cannot divide by zero.");
        }
        input.close();

    }
}