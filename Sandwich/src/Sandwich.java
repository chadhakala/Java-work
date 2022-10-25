
import java.util.ArrayList;
import java.util.Scanner;

public class Sandwich {



        public static void breadType(String breadType){


            ArrayList<String> breadType = new ArrayList<String>();
            breadType.add("french");
            breadType.add("White");
            breadType.add("Wheat");
            breadType.add("Wheat-Extra Grainy");
            breadType.add("Sprouted Grain");

            for (int i = 0; i < breadType.size(); i++) {

                System.out.println(breadType);

        }
    }
}