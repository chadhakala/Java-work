import java.util.Scanner;


public class MilesPerWeek {



        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);


                System.out.println("hello, my name is WESTERN-AMBER, your smart-home assistant, what's your name?");
                String name = keyboard.nextLine();

                System.out.println("Hello there, " + name + ", let's figure out your monthly gasoline expenses from your daily commute");


                System.out.println("Say the following thing to your google assistant-Hey, Google. Exactly how many miles do I drive each day to work? enter result");
                double dailyCommute = 2 * Double.parseDouble(keyboard.nextLine());


                System.out.println("How many miles per gallon do you get in your typical commute of " + dailyCommute + " miles round trip?");
                double milesPerGallon  = Double.parseDouble(keyboard.nextLine());

                double month = 20;   //work days in a month
                double costOfGas = 3.959;  // cost per gallon
                double rawGallonsMonth = dailyCommute * month / milesPerGallon;



                System.out.printf("WESTERN_AMBER says, If you work 20 days out of the month you pay approx: $%1.2f%n", rawGallonsMonth * costOfGas);

            }
}
