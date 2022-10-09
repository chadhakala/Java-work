
import java.util.Scanner;

public class LunarLander {

    public static int xTilt = 0;
    public static int yTilt = 0;
    public static int distanceToSurface = 0;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {            ///main method <<<<-----------
        String restart;
        do {
            startingValues();
        displayStatus();
            System.out.println("Your lunar pod is falling quick, enter terminal command input, now");
            System.out.println("1-x Tilt positive 2-x Tilt negative 3-y tilt positive 4-y tilt negative 5-thrusters 6-do nothing 7-self-destruct");
            int terminal = in.nextInt();
            while (distanceToSurface > 0) {
                if (terminal == 1) {
                    xTilt++;
                    kiloPerCycle();

                } else if (terminal == 2) {
                    xTilt--;
                    kiloPerCycle();
                } else if (terminal == 3) {
                    yTilt++;
                    kiloPerCycle();
                } else if (terminal == 4) {
                    yTilt--;
                    kiloPerCycle();
                } else if (terminal == 5) {
                    distanceToSurface += 2;
                    kiloPerCycle();
                } else if (terminal == 6) {
                    kiloPerCycle();
                } else if (terminal == 7) {
                    sos();
                    kiloPerCycle();
                } else {
                    System.out.println("you've entered an invalid command. Here's a list of the valid commands into terminal:");
                }
                displayStatus();
                if (distanceToSurface == 0){
                    break; // end loop
                }
                System.out.println("Your lunar pod is falling quick, enter terminal command input, now");
                System.out.println("1-x Tilt positive 2-x Tilt negative 3-y tilt positive 4-y tilt negative 5-thrusters 6-do nothing 7-self-destruct");
                terminal = in.nextInt();
            }
            if (xTilt == 0 && yTilt == 0) {
                System.out.println("Hello, Goku, You have successfully landed on Namek.");
            } else {
                System.out.println("Back to the snake road");    //<----*** look up where saiyans go when they die.
            }
            //game over *** <-----
            System.out.println("Would you like to play again? (y/n)");
            restart = in.next();
        } while (restart.equalsIgnoreCase("y"));      /// loook up while and do syntax--strings
        System.out.println("thank you for playing.");

    }

    public static void startingValues() {
        int minValue = -10;
        int maxValue = 10;
        xTilt = (int) (Math.random() * (maxValue - minValue)) + minValue; // x and y tilt formula (random)
        yTilt = (int) (Math.random() * (maxValue - minValue)) + minValue; // x and y tilt formula (random)
        distanceToSurface = 10;

    }

    public static void sos() {
        int cancelationCode = 1234;
        System.out.println("enter cancelation code now or you die");
        int code = in.nextInt();
        while (code != cancelationCode) {
            System.out.println("You've entered an invalid cancellation code. Try again:");
            code = in.nextInt();
        }
        System.out.println("Self-Destruct sequence deactivated");
    }

    public static void kiloPerCycle() {
        distanceToSurface--;
    }
    public static void displayStatus(){
        System.out.println("Distance: " + distanceToSurface);
        System.out.println("x-Tilt: " + xTilt);
        System.out.println("y-Tilt: " + yTilt);
    }
}
