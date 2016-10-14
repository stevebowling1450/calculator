package _001Calculator;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by stevebowling on 10/10/16.
 */
    public class Tip {
    public static void tip() throws IOException{

        Scanner num1 = new Scanner(System.in);
        Scanner func = new Scanner(System.in);

        double number1;
        int function;
        double total = 0;

        System.out.println("Bill Total:");
        number1 = num1.nextDouble();

        System.out.println("Rate your Service" + "\n" + "1 for Great = 20%" + "\n" + "2 for Good = 10%" + "\n"
                + "3 6for bad = 5%");
        function = func.nextInt();

        switch (function) {
            case 1:
                total = number1 * 1.2;
                break;
            case 2:
                total = number1 * 1.1;
                break;
            case 3:
                total = number1 * 1.05;
                break;
            default:
                System.out.println("Please choose 1 though 3");
                tip();
                break;
        }
        double totalBill = Math.round(total * 100.0) / 100.0;

        PrintWriter outFile = new PrintWriter(new FileWriter("tip.txt"));
        outFile.println("Total Bill with tip is: "+totalBill);
        outFile.close();

        System.out.println("Your total bill with tip is: "+ totalBill+"\n");

        Menu.menu();
    }
}
