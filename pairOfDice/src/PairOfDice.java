public class PairOfDice {


        public int die1 = 3;  //Number showing on the first die
        public int die2 = 4;        // number showing on the second die.

        public void getRoll() {
            // Roll the dice by setting each of the dice to be
            // a random number between 1 and 6.
            die1 = (int)(Math.random()*6) + 1;
            die2 = (int)(Math.random()*6) + 1;
        }

    } // end class PairOfDice





