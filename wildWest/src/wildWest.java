public class demoAdventureModel {

        import java.util.HashMap;
        import java.util.Scanner;



    public void startGame(){

        initGame();

        Scanner input = new Scanner(System.in);

        String cmd;

        Location currentLoc ,newLoc= null;

        int takeThing;

        boolean b = false;

        do{

            currentLoc = adventurer.getLocation();

            showHelpMenu();

            cmd = input.next();

            if(cmd.equalsIgnoreCase("Go")){

                do {

                    System.out.println("Current Location : "+ currentLoc);

                    System.out.println("Choose direction:");

                    System.out.println("one of north, south, east, west");

                    String direc = input.next();

                    b = checkPathExist(direc,currentLoc);

                    if(b) {

                        newLoc = adventurerNextLocation(direc,currentLoc);

                        adventurer.setLocation((Room) newLoc);

                    }

                    else {

                        System.out.println("Here is Water or Wall");

                        System.out.println("You can't Move to this direction");

                    }

                }while(b==false);

            }

            else if(cmd.equalsIgnoreCase("Look")){

                if(currentLoc instanceof Room)

                    ((Room) currentLoc).viewRoomContent();

                adventurer.viewAdventurerInventory();

            }

            else if(cmd.equalsIgnoreCase("Take")){

                if(currentLoc instanceof Room) {

                    ((Room) currentLoc).viewRoomContent();

                    System.out.println("Take the thing 0/1/2/3 .. from the room : ");

                    takeThing = Integer.parseInt(input.next());

                    Thing t = ((Room) currentLoc).getRoomItem(takeThing);

                    adventurer.take(t);

                    adventurer.viewAdventurerInventory();

                }

            }

            else if(cmd.equalsIgnoreCase("Drop")){

                adventurer.viewAdventurerInventory();

                System.out.println("Drop the thing 0/1/2/3 .. from the Inventory to room : ");

                takeThing = Integer.parseInt(input.next());

                if(currentLoc instanceof Room) {

                    Thing t =adventurer.getInventoryItem(takeThing);

                    ((Room) currentLoc).addObject(t);

                    ((Room) currentLoc).viewRoomContent();

                }

            }

            else if(cmd.equalsIgnoreCase("Use")){

                adventurer.viewAdventurerInventory();

                System.out.println("Use the thing 0/1/2/3 .. from the Inventory : ");

                takeThing = Integer.parseInt(input.next());

                Thing t =adventurer.getInventoryItem(takeThing);

                adventurer.drop(t);

            }

            else if(cmd.equalsIgnoreCase("Exit")){

                System.exit(0);

            }

            else{

                System.out.println("Invalid command");

            }

        }while(true);

    }

    public void showHelpMenu() {

        System.out.println("Choose command: ");

        System.out.println("Go");

        System.out.println("Look");

        System.out.println("Take");

        System.out.println("Drop");

        System.out.println("Use");

        System.out.println("Exit ");

        System.out.println();

    }

    public boolean checkPathExist(String path , Location loc) {

        HashMap<String ,Location> hm = loc.getRoomDir();

        if(hm.containsKey(path)) {

            if(hm.get(path) instanceof Room)

                return true;

        }

        return false;

    }

    public Location adventurerNextLocation(String path , Location loc) {

        HashMap<String ,Location> hm = loc.getRoomDir();

        if(hm.containsKey(path)) {

            if(hm.get(path) instanceof Room)

                return hm.get(path);

        }

        return loc;

    }

}
