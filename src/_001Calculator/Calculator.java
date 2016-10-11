package _001Calculator;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
/**
 * Created by stevebowling on 10/10/16.
 */
public class Calculator {



        public static void cal() throws IOException{
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

                System.out.println("function + - / * ");
                function = func.next();

                System.out.println("Second Num:");
                number2 = num2.nextInt();



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

                PrintWriter outFile = new PrintWriter(new FileWriter("cal.txt"));
                outFile.println("Your last calculation "+number1+function+number2+"="+ total);
                outFile.close();



                Scanner sc = new Scanner(System.in);
                System.out.println("Do another calculation? y/n");
                String more = sc.nextLine();
                if (more.equals("n")){
                    Menu.menu();
                }


            }
        }

    }



