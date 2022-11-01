import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Delivery {


    public static String askForOrder() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What will you have to eat tonight? or DONE");
        String itemz = keyboard.nextLine();
        return itemz;
    }

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

       //read file
         BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));

        String name = reader.readLine();

        System.out.println(name);


        BufferedReader inputFile = null;
        String line = reader.readLine();
        if (line.isEmpty()) {
            list.add(line);
            line = inputFile.readLine();
        }

        String itemz = askForOrder();
        while (!itemz.equalsIgnoreCase("done")) {
            list.add(itemz);
            itemz = askForOrder();
        }

        //Writing
        try {
            //opens the file
            PrintWriter fileOutput =
                    new PrintWriter(new BufferedWriter(new FileWriter("list.txt")));

            //write to the file
            fileOutput.close();

        } catch (IOException ex) {
            System.out.println(ex);

        }

            try {
                // opens the file - it will create a file if it doesn't exist

                // print writer will OVERWRITE any existing file
                PrintWriter fileOutput =
                        new PrintWriter(new BufferedWriter(new FileWriter("food.txt")));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

