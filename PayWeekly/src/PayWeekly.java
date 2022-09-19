import java.util.Scanner;

public class PayWeekly {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        System.out.println("please enter your weekly pay");
        double wage = Double.parseDouble(keyboard.nextLine());
        System.out.println("how many hours do you work per week? Please provide whole number values.");
        double hours = Double.parseDouble(keyboard.nextLine());

        if  (hours <= 40 || hours > 0 ) {

            double gross = (wage * hours);
            double tax = .1;
            double grossPay = tax * gross;
            double netPay = 0.9 * grossPay;


            System.out.printf("Your gross pay is: $%1.2f ", gross);
            System.out.printf("Your taxed income is: $%1.2f ", grossPay);
            System.out.printf("Your Weekly salary is: $%1.2f ", netPay);

        }
        else {
            double gross = (wage * hours);
            double tax = .1;
            double taxed = tax * gross;


            double oT = hours - 40;
            double otWage = (oT * 1.5) + gross;
            double weeklySalary = otWage * .9;



            System.out.printf("Your gross pay is: $%1.2f ", gross);
            System.out.printf("Your taxed income is: $%1.2f ", taxed);
            System.out.printf("Your Weekly salary is: $%1.2f ", weeklySalary);



        }
        }
    }