package _001Calculator;
import java.util.Scanner;
import java.io.IOException;
/**
 * Created by stevebowling on 10/10/16.
 */
public class Menu {
    public static void menu() throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose an option: "+"\n"+ "1 for Basic Cal"+ "\n"+"2 for Tip Cal"+"\n"+"3 for Grocery Cal "
                +"\n"+"4 to view past calculations"+"\n"+"5 for Help"+"\n"+"6 for Quit");
        int choose= sc.nextInt();
        switch (choose) {
            case 1:
                Calculator.cal();
                break;
            case 2:
                Tip.tip();
                break;
            case 3:
                Grocery.addGrade();
                break;
            case 5:
                Help.help();
                break;
            case 4:
                View.view();
                break;
            case 6:
                System.out.println("Thank you for using My Calculator App.");
                break;
            default:
                System.out.println("Please enter a number from 1 to 6 \n ");
                menu();
                break;
        }
        }
}
