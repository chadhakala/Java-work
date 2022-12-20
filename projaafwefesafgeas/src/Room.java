import java.util.ArrayList;

public class Room {
    private ArrayList<ArrayList<Room>> areaMap;
    private int currentRoom;
    private int playerRowIndex = 0;
    private int playerColumnIndex = 0;

    private boolean enemy;  //non-static variables
    private boolean blocked;  //
    private int gold;  //


    public void initialize(int playerRowIndex, int playerColumnIndex) {

        areaMap = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            areaMap.add(new ArrayList<>());
            for (int k = 0; k < 10; k++) {
                areaMap.get(i).add(new Room());
                for (int m = 0; m < 10; m++) {
                    areaMap.get(m).add(new Room());
                    ArrayList<Room> row = areaMap.get(playerRowIndex);
                    Room currentRoom = row.get(playerColumnIndex);

                }
            }
            System.out.println(areaMap);
        }
    }
    public static void main(String[] args){
    }

}


