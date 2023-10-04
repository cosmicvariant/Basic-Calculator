import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // stores two numbers
        double number1, number2;

        //take input from the user
         Scanner myScanner = new Scanner(System.in);

         System.out.println("enter your numbers:");

         //Take the inputs
         number1 =myScanner.nextDouble();
         number2=myScanner.nextDouble();

         System.out.println("enter the operator (+, -, /, *):");

         char operation = myScanner.next().charAt(0);
         double o = 0;

        // case to add two numbers
        if (operation == '+') {
            o = number1 + number2;
        } else if (operation == '*') {
            o = number1 * number2;
        } else if (operation == '/') {
            o = number1 / number2;
        } else if (operation == '-') {
            o = number1 - number2;
        } else {
            System.out.println("wrong input entered");
        }
System.out.println("Final result:");
        System.out.println();

        //print final result
        System.out.println(number1 + "" + operation + " " + number2 + " = " +o);
    }
}