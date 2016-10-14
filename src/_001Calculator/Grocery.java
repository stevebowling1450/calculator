package _001Calculator;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
/**
 * Created by stevebowling on 10/10/16.
 */
public class Grocery {
    public static void addGrade() throws IOException {
        ArrayList<Double> gradeBook = new ArrayList<>();
        Double ag;
        while (true) {
            Scanner tp = new Scanner(System.in);
            System.out.println("Please enter a Price:");
            ag = tp.nextDouble();
            gradeBook.add(ag);

            String moreG;
            Scanner more = new Scanner(System.in);
            System.out.println("Enter more prices y/n ");
            moreG = more.nextLine();

            double total=0;
            double sum=0;
            if (moreG.toLowerCase().substring(0, 1).equals("n")) {
                System.out.println("The total of your groceries are:");
                for (int i = 0; i < gradeBook.size(); i++) {
                    sum = sum + gradeBook.get(i);
                    total=sum*1.06;
                    total = Math.round(total * 100.0) / 100.0;
                }
                PrintWriter outFile = new PrintWriter(new FileWriter("grocery.txt"));
                outFile.println("Your total bill was: "+ total);
                outFile.close();
                System.out.println("$"+total +"\n");
                break;
            }
        }
        Menu.menu();
    }
}
