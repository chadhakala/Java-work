import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class takeout {




        try{
        BufferedWriter writer = null;

            writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("What will you have for dinner, fam?");
            writer.close();
        } catch (IOException ex) {

            System.out.println(ex);

        }
    }
}




