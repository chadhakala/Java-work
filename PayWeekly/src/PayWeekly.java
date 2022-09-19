import java.util.Scanner;

public class PayWeekly {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        System.out.println("Hello, I will calculate your paycheck. Please enter your hourly pay");
        double wage = Double.parseDouble(keyboard.nextLine());
        System.out.println("how many hours do you work per week? Please provide whole number values.");
        double hours = Double.parseDouble(keyboard.nextLine());

        if  (hours <= 40 || hours > 0 ) {

            double gross = (wage * hours);
            double tax = .1 * gross;
            double netPay = gross - tax;



            System.out.printf("Your gross pay is: $%1.2f ", gross);
            System.out.printf("Your taxed income is: $%1.2f ", tax);
            System.out.printf("Your Weekly salary is: $%1.2f ", netPay);

        }
        else {
            double grossStd = (wage * hours);
            double taxed = .1 * grossStd;


            double oT = hours - 40;
            double otWage = ((oT * 1.5) + grossStd);
            double otNet = otWage - taxed;




            System.out.printf("Your gross pay is: $%1.2f ", otWage);
            System.out.printf("Your taxed income is: $%1.2f ", taxed);
            System.out.printf("Your Weekly salary is: $%1.2f ", otNet);



        }
        }
    }