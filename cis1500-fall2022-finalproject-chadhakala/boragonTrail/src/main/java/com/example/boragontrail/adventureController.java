package com.example.boragontrail;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.Random;


public class adventureController {

    @FXML
    private TextArea textArea;
    @FXML
    private Button upButton;
    int up;
    @FXML
    private Button leftButton;
    int left;
    @FXML
    private Button rightButton;
    int right;
    @FXML
    private Button downButton;
    int down;
    @FXML
    private Button searchButton;

    @FXML
    private Button attackButton;


    @FXML
    private Button runButton;
    @FXML
    private Button sleepButton;
    //name of class


    private ArrayList<ArrayList<Room>> areaMap = new ArrayList<ArrayList<Room>>();

    private int playerRowIndex = 0;
    private int playerColumnIndex = 0;
    private Player player;
    @FXML
    private Label enemyStat;
    @FXML
    private Label playerStat;

    public int rollDice(int side) {
        Random random = new Random();
        return random.nextInt(side) + 1;
    }

    public void initialize() {
        player = new Player();
        textArea.setEditable(false);
         areaMap = new ArrayList<ArrayList<Room>>();
        for (int row = 0; row < 10; row++) {
            ArrayList<Room> colRoom = new ArrayList<Room>();
            for (int col = 0; col < 10; col++) {
                Room room = new Room(row, col);
                if (rollDice(10) - 1 == col) {
                    room.setBlocked(true);

                } else {
                    room.setBlocked(false);
                }
                colRoom.add(room);
            }

            areaMap.add(colRoom);
        }
        stats();
    }

    @FXML
    public void buttonClicked(ActionEvent actionEvent) {

        if (actionEvent.getSource() == upButton) {
            moveUp();
        } else if (actionEvent.getSource() == leftButton) {
            moveLeft();
        } else if (actionEvent.getSource() == rightButton) {
            moveRight();
        } else if (actionEvent.getSource() == downButton) {
            moveDown();
        } else if (actionEvent.getSource() == searchButton) {
            searchRoom();
        } else if (actionEvent.getSource() == sleepButton) {
            sleepRoom();
        } else if (actionEvent.getSource() == attackButton) {
            attackRoom();
        } else if (actionEvent.getSource() == runButton) {
            runRoom();
        }
        stats();
        if (player.getHitPoints() <= 0) {
            textArea.setText("GAME OVER");
            leftButton.setDisable(true);
            rightButton.setDisable(true);
            downButton.setDisable(true);
            upButton.setDisable(true);
            searchButton.setDisable(true);
            sleepButton.setDisable(true);
            attackButton.setDisable(true);
            runButton.setDisable(true);
        }
        //credits
    }

    public void stats() {
        String playerInfo = "HP: " + player.getHitPoints() + "\n"
                + "Strength: " + player.getStrength() + "\n"
                + "Dexterity: " + player.getDexterity() + "\n"
                + "Intelligence: " + player.getIntelligence() + "\n"
                + "Gold: " + player.getGold();
        playerStat.setText(playerInfo);
        if (currentRoom().isEnemy()) {
            String enemyInfo = "HP: " + currentRoom().getNpc().getHitPoints() + "\n"
                    + "Strength: " + currentRoom().getNpc().getStrength() + "\n"
                    + "Dexterity: " + currentRoom().getNpc().getDexterity() + "\n"
                    + "Intelligence: " + currentRoom().getNpc().getIntelligence();
            enemyStat.setText(enemyInfo);
        } else {
            String enemyInfo = "HP: " + "\n"
                    + "Strength: " + "\n"
                    + "Dexterity: " + "\n"
                    + "Intelligence: ";
            enemyStat.setText(enemyInfo);

        }
    }

    public Room currentRoom() {

        return areaMap.get(playerRowIndex).get(playerColumnIndex);
    }

    public void moveUp() {
        playerRowIndex--;
        if (playerRowIndex < 0) {
            playerRowIndex = 0;
            textArea.setText("You cannot go past the wall.");
        } else if (currentRoom().isBlocked()) {
            playerRowIndex++;
            textArea.setText("The Room above is blocked. Pick another room");
        } else
            textArea.setText("You moved up");
    }

    public void moveDown() {
        playerRowIndex++;
        if (playerRowIndex >= 10) {
            playerRowIndex = 9;
            textArea.setText("You cannot go past the wall.");
        } else if (currentRoom().isBlocked()) {
            playerRowIndex--;
            textArea.setText("The Room below is blocked. Pick another room");
        }
        else
        textArea.setText("You moved down");
    }

    public void moveLeft() {
        playerColumnIndex--;
        if (playerColumnIndex < 0) {
            playerColumnIndex = 0;
            textArea.setText("You cannot go past the wall.");
        } else if (currentRoom().isBlocked()) {
            playerColumnIndex++;
            textArea.setText("The Room left is blocked. Pick another room");
        }
        else
        textArea.setText("You moved left");

    }

    public void moveRight() {
        playerColumnIndex++;
        if (playerColumnIndex >= 10) {
            playerColumnIndex = 9;
            textArea.setText("You cannot go past the wall.");
        } else if (currentRoom().isBlocked()) {
            playerColumnIndex--;
            textArea.setText("The Room right is blocked. Pick another room");
        }
        else
        textArea.setText("You moved right");
    }

    public void searchRoom() {
        int value = rollDice(20);
        if (value < player.getIntelligence()) {
            textArea.setText("You found gold!╰(*°▽°*)╯");
            player.setGold(currentRoom().getTotalLoot());
        } else {
            textArea.setText("There's nothing but cobwebs...");
        }
    }

    public void sleepRoom() {

        player.setHitPoints(20);
        textArea.setText("Your HP has been replenished\n");
        if (currentRoom().isEnemy()) {
            int value = rollDice(6);
            if (value == 5) {
                textArea.appendText("You've been ambushed! You wake up groggy and unrefreshed.ಠ╭╮ಠ");
            }
        } else {
            textArea.appendText("You managed to catch a few winks. You feel refreshed.^_____^");
        }
    }

    public void runRoom() {
        if (currentRoom().isEnemy()) {
            int value = rollDice(20);
            if (value < currentRoom().getNpc().getIntelligence()) {
                textArea.setText("The monster saw you! they attack!!!\n");
            } else {
                textArea.setText("The monster didn't see you.\n");
            }
        }
        switch (rollDice(4)) {
            case 1:
                moveUp();
                break;
            case 2:
                moveDown();
                break;
            case 3:
                moveLeft();
                break;
            case 4:
                moveRight();
                break;
        }
        textArea.appendText("You have run and escaped.");
    }

    public void attackRoom() {

        if (currentRoom().isEnemy()) {
            int value = rollDice(20);
            if (value >= currentRoom().getNpc().getDexterity()) {
                textArea.setText("You hit the monster!\n");
                currentRoom().getNpc().setHitPoints(currentRoom().getNpc().getHitPoints() - (player.getStrength() / 3));

            }
            if (currentRoom().getNpc().getHitPoints() > 0 || value >= player.getDexterity()) {
                textArea.appendText("They hit you back. You take damage.\n");
                player.setHitPoints(player.getHitPoints() - currentRoom().getNpc().getStrength());
            }
            if (currentRoom().getNpc().getHitPoints() <= 0) {
                textArea.appendText("You've defeated a monster!..(*￣０￣)ノ");
            }
        } else {
            textArea.setText("There's no monster in the room. Venture on. ^o^");
        }
    }
}





