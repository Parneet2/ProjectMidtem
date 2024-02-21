/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic {

    public static void main(String[] args) {
        ArithmeticBase calculator = new ArithmeticBase();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double x = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double y = scanner.nextDouble();

        System.out.println("Enter arithmetic operation to Perform (PLUS, MINUS, TIMES, DIVIDE): ");
        String operationStr = scanner.next();

        ArithmeticBase.Operation operation = ArithmeticBase.Operation.valueOf(operationStr.toUpperCase());

        double result = calculator.calculate(x, y, operation);

        System.out.println("Result: " + result);
    }
}

