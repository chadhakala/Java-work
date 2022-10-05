import java.util.Scanner;

public class ProjectZero {



    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double width;
        double length;
        double distance;
        double board;



        System.out.println("Okay, so you want a rectangular fence. What is the width of your fence?");
        width = Double.parseDouble(keyboard.nextLine());
        System.out.println("Okay, so you want a rectangular fence. What is the length of your fence?");
        length = Double.parseDouble(keyboard.nextLine());
        System.out.println("What is the distance you want between each of your posts?");
        distance = Double.parseDouble(keyboard.nextLine());

        double perimeter = 2 * (length + width);

        if (perimeter % distance > 0) {
            System.out.println("Your entry was invalid. Run this program again. ");
        System.exit(0);
        }
        double post = perimeter / distance;
        System.out.println("What is the length of the boards you want?");
        board = Double.parseDouble(keyboard.nextLine());

        if (board < distance) {
            System.out.println("Your board is less than the post distance, Maybe you should get a bigger truck or try again. ");
            System.exit(0);
        }
        System.out.println("How many planks across for your horse fence?");
        double planks = Double.parseDouble(keyboard.nextLine());
        double numberOfBoards = (post - 1) * planks;



    }
}
