package chapter2;

public class Chapter2 {
    public static void main(String[] args) {

        // declaring a variable
        int yourNumber;

        // assign the value 10 to the variable yourNumber
        yourNumber = 10;

        System.out.println("Your number is " + yourNumber);

        // declare and assign - I like this way
        int myFavoriteNumber = 42;

        System.out.println("my favorite number is: " + myFavoriteNumber);

        double numberWithADecimal = 7.7;

        yourNumber = 12;

        // a double can hold an in
        numberWithADecimal = 12;

        //java doesn't care about variable names
        // people care your variable names
        int a = 10;
        int b = 20;
        int c = 30;


        // but an int can't hold a double
        // yourNumber = 7.7;

        numberWithADecimal = yourNumber;

        System.out.println("Number with a decimal's value is " + numberWithADecimal);

        System.out.println("your number is: " + yourNumber);

        // Please Excuse My Dear Aunt Sally
        //Parenthesis Exponents ( Multiplication Division ) ( Addition Subtraction )

        System.out.println("what is 5 - 2 + 3");
        System.out.println(5 - 2 + 3);
        System.out.println("95% of people can't figure this one out: 9 / 3 * 3 + 2");
        System.out.println(9 / 3 * 3 + 2);

        myFavoriteNumber = 10 + 2;
        myFavoriteNumber = myFavoriteNumber + 10;
        // combined assignment operator
        myFavoriteNumber += 10;

        //not a combined assignment operator - this will set the value to Positive 10
        myFavoriteNumber =+ 10;

        myFavoriteNumber = yourNumber * 3 + 6;

        System.out.println("My favorite number is now: " + myFavoriteNumber);

        //integer division gives integer results - % is the modulus operator, gives the remainder
        System.out.println("5 / 2 == " + 5 / 2);

        System.out.println("5 / 2 == " + 5 / 2 + " with a remainder of: " + 5 % 2);

        //to get a double result from division, one or both need to be a double
        double answer = 5.0 / 2;

        System.out.println("5 / 2 with a decimal result is: " + answer);

        // to treat a value as a double, you can 'cast' it as double with (double)
        double myFavoriteNumberDividedByYourFavoriteNumber = (double)myFavoriteNumber / yourNumber;

        System.out.println(myFavoriteNumberDividedByYourFavoriteNumber);


        String firstName = "Chad";
        String lastName = "Hakala";

        String fullName

        //we're not "adding" we're concatenating
        System.out.println(firstName + " " + lastName);


        String fullName = firstName;
    }
}