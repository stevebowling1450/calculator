package _001Calculator;
import java.io.FileReader;
import java.io.*;
import java.util.Scanner;


/**
 * Created by stevebowling on 10/10/16.
 */
public class View {



    public static void view() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose an option: "+"\n"+ "1 View history of Basic Cal"+ "\n"+"2 Clear history of Basic Calculator"+"\n"+
                "3 View history of Tip Cal "
                +"\n"+"4 to clear tip calculator"+"\n"+"5 View history of  Grocery Cal"+"\n"+"6 Clear history of Grocery calculator ");
        int choose= sc.nextInt();
        if (choose==1){
            try {
                File file = new File("cal.txt");
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                StringBuffer stringBuffer = new StringBuffer();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuffer.append(line);
                    stringBuffer.append("\n");
                }
                fileReader.close();
                System.out.println("Contents of file:");
                System.out.println(stringBuffer.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
            else if (choose==2){
            PrintWriter outFile = new PrintWriter(new FileWriter("cal.txt"));
            }

            else if (choose==3){
            try {
                File file = new File("tip.txt");
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                StringBuffer stringBuffer = new StringBuffer();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuffer.append(line);
                    stringBuffer.append("\n");
                }
                fileReader.close();
                System.out.println("Contents of file:");
                System.out.println(stringBuffer.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (choose==4){
            PrintWriter outFile = new PrintWriter(new FileWriter("tip.txt"));
        }

        else if (choose==5){
            try {
                File file = new File("grocery.txt");
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                StringBuffer stringBuffer = new StringBuffer();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuffer.append(line);
                    stringBuffer.append("\n");
                }
                fileReader.close();
                System.out.println("Contents of file:");
                System.out.println(stringBuffer.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (choose==6){
            PrintWriter outFile = new PrintWriter(new FileWriter("grocery.txt"));
        }
        Menu.menu();
    }
}