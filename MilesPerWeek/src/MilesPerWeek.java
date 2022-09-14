import java.util.Scanner;


public class MilesPerWeek {



        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);



                System.out.println("Say the following thing to your google assistant--Hey, Google. Exactly how many miles do I drive each day to and from work? What is the answer?");
                int dailyCommute = Integer.parseInt(keyboard.nextLine());


                int weeklyCommute = dailyCommute * 5;
                System.out.println("How many miles per gallon do you get per get?");
                double gallonsUsed  = Double.parseDouble(keyboard.nextLine());

                double year = 260;   //work days in a year
                double costOfGas = 4.71;  // cost per gallon
                double total = costOfGas * year * weeklyCommute / gallonsUsed;

                System.out.printf("If you work 220 days out of the year you drive approx: $%1.2f%n", total);

            }
}
