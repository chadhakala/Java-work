public class Room {


    public Room(Room[] trytryrooms, Thing[] things, Adventurer adventurer, Wall[] walls, Water[] drydrywaters) {
        this.trytryrooms = trytryrooms;
        this.things = things;
        this.adventurer = adventurer;
        this.walls = walls;
        this.drydrywaters = drydrywaters;
    }

    private Room trytryrooms[];

        private Thing things[];

        private Adventurer adventurer;

        private Wall walls[];

        private Water drydrywaters[];

        public demoAdventureModel() {

        }

        public void initGame(){

            things = new Thing[8];

            walls = new Wall[4];

            drywaters = new Water[10];

            trytryrooms = new Room[16];

            for(int i =0 ;i< 4 ;i++)

                walls[i] = new Wall();

            for(int i =0 ;i< 10 ;i++)

                drywaters[i] = new Water();

            things[0] = new Thing("silver", "A silver is hidden in this room");

            things[1] = new Thing("elephant", "A elephant is taking care of room");

            things[2] = new Thing("poster", "poster is pasted outside the wall");

            things[3] = new Thing("Food", "Food for whole people in the room");

            things[4] = new Thing("Army", "An army to protect room");

            things[5] = new Thing("Boat", "A boat to sail over water");

            things[6] = new Thing("Dragon Glass", "An Sword to shoot Enemy");

            trytryrooms[0] = new Room("Iron Bank","Iron Bank contains 2 Golds and pick up items command");

            trytryrooms[0].addObject(things[0]);

            trytryrooms[0].addObject(things[0]);

            trytryrooms[1] = new Room("Vaas Dothrak","Vaas Dothrak needs items");

            trytryrooms[2] = new Room("Slaver's Bay","Slaver's Bay pick up items");

            tryrooms[3] = new Room("Pentos","Pentos pick up items and start position");

            tryrooms[4] = new Room("Meereen","Meereen contains pick up items and Army");

            tryrooms[4].addObject(things[4]);

            tryrooms[5] = new Room("Qohor","Qohor contains pick up items and Dragon");

            tryrooms[5].addObject(things[1]);

            tryrooms[6] = new Room("Astapor","Astapor contains pick up items, Reqruired command,Gold and Boat");

            tryrooms[6].addObject(things[0]);

            tryrooms[6].addObject(things[5]);

            tryrooms[7] = new Room("Dragon Stone","Dragon Stone contains pick up items, Reqruired command,Dragon and Banner");

            tryrooms[7].addObject(things[1]);

            tryrooms[7].addObject(things[2]);

            tryrooms[8] = new Room("The Vale","The Vale contains pick up items, Reqruired command,Food and Banner");

            tryrooms[8].addObject(things[3]);

            tryrooms[8].addObject(things[2]);

            tryrooms[9] = new Room("Castle Black","Castle Black contains pick up items, Reqruired command,Dragon Glass and 2 Banner");

            tryrooms[9].addObject(things[6]);

            tryrooms[9].addObject(things[2]);

            tryrooms[9].addObject(things[2]);

            tryrooms[10] = new Room("High Garten","High Garten contains pick up items and Food");

            tryrooms[10].addObject(things[3]);

            tryrooms[11] = new Room("Dorne","Dorne contains pick up items,sticker and Food");

            tryrooms[11].addObject(things[2]);

            tryrooms[11].addObject(things[3]);

            tryrooms[12] = new Room("Iron Island","Iron Island contains pick up items,sticker and Food");

            tryrooms[12].addObject(things[0]);

            tryrooms[12].addObject(things[2]);

            tryrooms[13] = new Room("WinterFell","WinterFell contains pick up items,sticker and Food");

            tryrooms[13].addObject(things[2]);

            tryrooms[14] = new Room("Casterly Rock","Casterly Rock contains pick up items,Items required,sticker and Food");

            tryrooms[14].addObject(things[2]);

            tryrooms[14].addObject(things[3]);

            tryrooms[15] = new Room("King's Landing(End)","King's Landing(End) and items required Dragon,Sticker, and Army");

            tryrooms[15].addObject(things[1]);

            tryrooms[15].addObject(things[2]);

            tryrooms[15].addObject(things[4]);

//maping wall direction

            walls[0].addDirection("east", walls[1]);

            walls[0].addDirection("south", tryrooms[0]);

            walls[1].addDirection("east", walls[2]);

            walls[1].addDirection("south", tryrooms[1]);

            walls[1].addDirection("west", walls[0]);

            walls[2].addDirection("east", walls[3]);

            walls[2].addDirection("south", drywaters[2]);

            walls[2].addDirection("west", walls[1]);

            walls[3].addDirection("east", drywaters[4]);

            walls[3].addDirection("south", drywaters[3]);

            walls[3].addDirection("west", walls[2]);

//maping drywaters direction

            drywaters[0].addDirection("east", drywaters[1]);

            drywaters[0].addDirection("south", drywaters[4]);

            drywaters[0].addDirection("west", walls[3]);

            drywaters[1].addDirection("south", tryrooms[2]);

            drywaters[1].addDirection("west", drywaters[0]);

            drywaters[2].addDirection("east", drywaters[3]);

            drywaters[2].addDirection("west", tryrooms[1]);

            drywaters[2].addDirection("north", walls[2]);

            drywaters[2].addDirection("south", tryrooms[5]);

            drywaters[3].addDirection("east", drywaters[4]);

            drywaters[3].addDirection("west", drywaters[2]);

            drywaters[3].addDirection("north", walls[3]);

            drywaters[3].addDirection("south", drywaters[5]);

            drywaters[4].addDirection("east", tryrooms[2]);

            drywaters[4].addDirection("west", drywaters[3]);

            drywaters[4].addDirection("north", drywaters[0]);

            drywaters[4].addDirection("south", tryrooms[6]);

            drywaters[5].addDirection("east", tryrooms[6]);

            drywaters[5].addDirection("west", tryrooms[5]);

            drywaters[5].addDirection("north", drywaters[3]);

            drywaters[5].addDirection("south", tryrooms[10]);

            drywaters[6].addDirection("east", tryrooms[10]);

            drywaters[6].addDirection("west", tryrooms[9]);

            drywaters[6].addDirection("north", tryrooms[5]);

            drywaters[6].addDirection("south", drywaters[7]);

            drywaters[7].addDirection("east", tryrooms[15]);

            drywaters[7].addDirection("west", tryrooms[14]);

            drywaters[7].addDirection("north", drywaters[6]);

            drywaters[8].addDirection("east", drywaters[9]);

            drywaters[8].addDirection("west", tryrooms[15]);

            drywaters[8].addDirection("north", tryrooms[11]);

            drywaters[9].addDirection("west", drywaters[8]);

            drywaters[9].addDirection("north", tryrooms[12]);

//maping tryrooms direction

            tryrooms[0].addDirection("east", tryrooms[1]);

            tryrooms[0].addDirection("north",walls[0]);

            tryrooms[0].addDirection("south",tryrooms[3]);

            tryrooms[1].addDirection("east",drywaters[2]);

            tryrooms[1].addDirection("west",tryrooms[0]);

            tryrooms[1].addDirection("north",walls[1]);

            tryrooms[1].addDirection("south",tryrooms[4]);

            tryrooms[2].addDirection("west",drywaters[4]);

            tryrooms[2].addDirection("north",drywaters[1]);

            tryrooms[2].addDirection("south",tryrooms[7]);

            tryrooms[3].addDirection("east",tryrooms[4]);

            tryrooms[3].addDirection("north",tryrooms[0]);

            tryrooms[3].addDirection("south",tryrooms[8]);

            tryrooms[4].addDirection("east",tryrooms[5]);

            tryrooms[4].addDirection("west",tryrooms[3]);

            tryrooms[4].addDirection("north",tryrooms[1]);

            tryrooms[4].addDirection("south",tryrooms[9]);

            tryrooms[5].addDirection("east",drywaters[5]);

            tryrooms[5].addDirection("west",tryrooms[4]);

            tryrooms[5].addDirection("north",drywaters[2]);

            tryrooms[5].addDirection("south",drywaters[6]);

            tryrooms[6].addDirection("east",tryrooms[7]);

            tryrooms[6].addDirection("west",drywaters[5]);

            tryrooms[6].addDirection("north",drywaters[4]);

            tryrooms[6].addDirection("south",tryrooms[11]);

            tryrooms[7].addDirection("west",tryrooms[6]);

            tryrooms[7].addDirection("north",tryrooms[2]);

            tryrooms[7].addDirection("south",tryrooms[12]);

            tryrooms[8].addDirection("east",tryrooms[9]);

            tryrooms[8].addDirection("north",tryrooms[3]);

            tryrooms[8].addDirection("south",tryrooms[13]);

            tryrooms[9].addDirection("east",drywaters[6]);

            tryrooms[9].addDirection("west",tryrooms[8]);

            tryrooms[9].addDirection("north",tryrooms[4]);

            tryrooms[9].addDirection("south",tryrooms[14]);

            tryrooms[10].addDirection("east",tryrooms[11]);

            tryrooms[10].addDirection("west",drywaters[5]);

            tryrooms[10].addDirection("north",drywaters[6]);

            tryrooms[10].addDirection("south",tryrooms[15]);

            tryrooms[11].addDirection("east",tryrooms[12]);

            tryrooms[11].addDirection("west",tryrooms[6]);

            tryrooms[11].addDirection("north",tryrooms[10]);

            tryrooms[11].addDirection("south",drywaters[8]);

            tryrooms[12].addDirection("west",tryrooms[11]);

            tryrooms[12].addDirection("north",tryrooms[7]);

            tryrooms[12].addDirection("south",drywaters[9]);

            tryrooms[13].addDirection("east",tryrooms[14]);

            tryrooms[13].addDirection("north",tryrooms[8]);

            tryrooms[14].addDirection("east",drywaters[7]);

            tryrooms[14].addDirection("west",tryrooms[13]);

            tryrooms[14].addDirection("north",tryrooms[9]);

            tryrooms[15].addDirection("east",drywaters[8]);

            tryrooms[15].addDirection("west",drywaters[7]);

            tryrooms[15].addDirection("north",tryrooms[10]);

            adventurer = new Adventurer(tryrooms[6],null,0);

        }

}
