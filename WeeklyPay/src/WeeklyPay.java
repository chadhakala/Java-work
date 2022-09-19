import java.util.Scanner;

public class WeeklyPay {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        System.out.println("please enter your weekly pay");
        double wage = Double.parseDouble(keyboard.nextLine());

        System.out.println("how many hours do you work per week? Please provide whole number values.");
        double hours = Double.parseDouble(keyboard.nextLine());


        if (hours > 40) {


            double grossPay = hours * wage;
            double oT = hours - 40;
            double grossOt = hours - oT;
            double otWage = grossPay + (grossOt * 1.5);
            double taxesPayed = grossPay * 1.9;
            double weeklySalary = otWage - taxesPayed;
            double tax = .1;
            double netPay = grossPay - taxesPayed;


            System.out.printf("Your Weekly Gross Pay: $%1.2f ", otWage);
            System.out.printf("Your Weekly salary is: $%1.2f ", weeklySalary);

            else {
                double tax = .1;
                double grossPay = hours * wage;
                double netPay = grossPay - taxesPayed;
                double taxesPayed = netPay * 1.9;



            System.out.printf("Your Weekly Gross Pay: $%1.2f ", taxesPayed);}






            System.out.printf("Your Weekly Gross Pay: $%1.2f ", grossPay);
            System.out.printf("Your Weekly salary is: $%1.2f ", netPay);
        }
    }
}






