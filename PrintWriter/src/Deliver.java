
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Deliver {


    public static void main(String[] args) throws FileNotFoundException {


        Scanner keyboard = new Scanner(System.in);

        System.out.println("What restaurant would you like to order from?");
        String restaurant = keyboard.nextLine();

        String fileName = restaurant + ".txt";

//        PrintWriter printWriter = new PrintWriter(fileName);
//
//        for (int index = 0; index < 3; index++) {
//            System.out.println("Which item would you like?");
//            String item = keyboard.nextLine();
//            System.out.println("What is the price of that item?");
//            String price = keyboard.nextLine();
//            printWriter.println(item);
//            printWriter.println(price);
//        }
//        printWriter.close();

        Scanner Output = new Scanner(new File(fileName));
        String item1 = Output.nextLine();
        double price1 = Double.parseDouble(Output.nextLine());
        String item2 = Output.nextLine();
        double price2 = Double.parseDouble(Output.nextLine());
        String item3 = Output.nextLine();
        double price3 = Double.parseDouble(Output.nextLine());

        Output.close();
        double total = price1 + price2 + price3;
        double tip = total * .20;
        System.out.println("Your order will be ready in 30 minutes");
        System.out.println("Your total is " + total);
        System.out.println("Your suggested tip amount is " + tip);
    }


}
