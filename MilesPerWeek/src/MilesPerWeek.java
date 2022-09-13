import java.util.Scanner;


public class MilesPerWeek {



        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);

            {

                double milesPerGallon;

                System.out.println("How many miles do you drive per week?");
                int milesWeek = Integer.parseInt(keyboard.nextLine());

                System.out.println("Say the following thing to your google assistant--Hey, Google. Exactly how many miles do I drive each day to and from work?");
                int dailyCommute = Integer.parseInt(keyboard.nextLine());

                System.out.println("How many miles per gallon do you get per get? ");
                milesPerGallon = keyboard.nextDouble();

                double year = 260;   //work days in a year
                double costOfGas = 4.71;  // cost per gallon
                double costOfGaS = milesWeek * dailyCommute;    //This is a figure that represents a in vivo fuel eco
                double total = dailyCommute * costOfGas / fuelEco * year;

                System.out.printf("If you work 220 days out of the year you drive approx: $%1.2f%n", total);

            }
}