import java.util.ArrayList;
import java.util.Arrays;

public class randomNumberGen {

        public static void main(String[] args) {


            //Arrays Arrays Arrays Arrays Arrays Arrays Arrays Arrays Arrays Arrays Arrays Arrays

            String[] friendsArray = new String[4];
            String[] array2 = {"John", "Chris", "Eric", "Luke"};

            // Printing an Array
            //[]0[[1][2][3]
            // print says Eric
            System.out.println(array2[2]);


            //You can't add more indices to the end of an array
//---------------------------------------------------------------------------------------------------------------------

            //ArrayLists ArrayLists ArrayLists ArrayLists ArrayLists ArrayLists ArrayLists ArrayLists

            ArrayList<String> exampleList = new ArrayList<>();
            ArrayList<String> exampleList2 = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));

                                                                                                                //Also you can pass in another data type
                                                                                                                // With ArrayList it's a lil diff



            //If you didn't specify the items it could be an immutable list (can't change the arrayList elements)
            //<b> for boolean <l> <--- letter L for long and so on.
            ArrayList<Integer> exampleList3 = new ArrayList<>();
            ArrayList<String> exampleList4 = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));

            //Adding an element to ArrayList
            //prints Mitch
            exampleList4.add("Mitch");
            System.out.println(exampleList4.get(4));

            //printing an ArrayList
            //Should print Chris
            System.out.println(exampleList4.get(1));
//---------------------------------------------------------------------------------------------------------------------
        //get the length (or get size) of an Array and Arraylist respectively
        //4 will print
            System.out.println(array2.length);
            System.out.println(exampleList4.size());

//---------------------------------------------------------------------------------------------------------------------
            //Set an element for Array and ArrayList
            //As you can see exampleList4[0] *was* John. Now John will be replaced by Carl.
            array2[0] = "Carl";
            System.out.println(array2[0]);
            exampleList4.set(0, "Carl");
            System.out.println(exampleList4.get(0));


            //removing from an ArrayList (cannot do with Arrays) :(
            exampleList4.remove("Chris");
            System.out.println(exampleList4.get(1));

            //printing an Array sucks cuz at the end it prints the memory address of the array which you probably don't need. bv
        }
    }

