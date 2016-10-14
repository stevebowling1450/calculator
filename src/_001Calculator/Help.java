package _001Calculator;

import java.util.Scanner;
import java.io.IOException;
/**
 * Created by stevebowling on 10/10/16.
 */
public class Help {
    public static void help() throws IOException{
        int h1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Help with:"+"\n"+"1 Basic Cal"+"\n"+"2 Tip Cal"+"\n"+
                        "3 Grocery Cal");
        h1= sc.nextInt();
        switch (h1) {
            case 1:
                System.out.println("Use this function to do simple calculations." + "\n" +
                        "Enter your  first number , then your last number,," + "\n" + "lastly give a function you want done." + "\n");

                break;
            case 2:
                System.out.println("Use this function to calculate your total bill plus tip. \n Enter your bill. \n Rate the service." +
                        " \n And it will calculate the total for you." + "\n");
                break;
            case 3:
                System.out.println("Use this function to total up your grocery bill. \n Just enter in the prices of the items you are buying. \n" +
                        "And the calculator will total the bill including tax. " + "\n");
                break;
        }
        Menu.menu();
    }
}
