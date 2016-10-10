package _001Calculator;
import java.util.Scanner;

/**
 * Created by stevebowling on 10/10/16.
 */
public class Calculator {



        public static void cal() {
            while (true) {

                Scanner num1 = new Scanner(System.in);
                Scanner num2 = new Scanner(System.in);
                Scanner func = new Scanner(System.in);

                double number1;
                double number2;
                String function;
                double total = 0;

                System.out.println("First Num:");
                number1 = num1.nextInt();

                System.out.println("Second Num:");
                number2 = num2.nextInt();

                System.out.println("function + - / * ");
                function = func.next();

                if (function.equals("*")) {
                    total = number1 * number2;
                } else if (function.equals("/")) {
                    total = number2 / number1;
                } else if (function.equals("-")) {
                    total = number2 - number1;
                } else if (function.equals("+")) {
                    total = number2 + number1;
                } else {
                    System.out.println(" Please input a function");
                }

                System.out.println(total);


            }
        }

    }



