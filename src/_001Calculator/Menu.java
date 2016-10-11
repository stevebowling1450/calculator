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
        if (choose==1 ){
            Calculator.cal();
        } else if ( choose == 2){
            Tip.tip();
        }else if (choose==3){
            Grocery.addGrade();
        }else if (choose==5){
            Help.help();
        }else if (choose==4){
            View.view();

        } else if (choose==6){
            System.out.println("Thank you for using My Calculator App.");

        }
        }
}
