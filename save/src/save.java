import java.util.ArrayList;
import java.util.Scanner;

public class save {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);



        System.out.println("How much do you need to save to meet that goal?");
        int cost = Integer.parseInt(keyboard.nextLine());


        ArrayList<Integer> weeksCt = new ArrayList<>();


        System.out.println("how much will you be saving in week 1?");
         weeksCt.add(1);
        weeksCt.set(1, Integer.parseInt(keyboard.nextLine()));


        System.out.println("how much will you be saving in week 2?");
        int week1 = Integer.parseInt(keyboard.nextLine());
        week1 == weeksCt[0];

        System.out.println("how much will you be saving in week 3?");
        weeksCt.set(3, Integer.parseInt(keyboard.nextLine()));
        }

    }


