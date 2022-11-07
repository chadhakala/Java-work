import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class labEight {
public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
        String fileName;
    System.out.println("What would you like to eat?");
    String restaurant = keyboard.nextLine();
    fileName = (restaurant + ".txt");
        try {

            BufferedWriter in = new BufferedWriter(new FileWriter("fileName"));

            in.write("this is the order");
            String input1 = keyboard.nextLine();
            System.out.println("How much does that cost?");
            double price1 = keyboard.nextDouble();
            in.write(input1 + price1);

            System.out.println("What's the next thing?");
            String input2 = keyboard.nextLine();
            System.out.println("How much does that cost?");
            double price2 = keyboard.nextDouble();
            in.write(input2 + price2);

            System.out.println("What's the next thing?");
            String input3 = keyboard.nextLine();
            System.out.println("How much does that cost?");
            double price3 = keyboard.nextDouble();
            in.write(input3 + price3);

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
    }







}
}