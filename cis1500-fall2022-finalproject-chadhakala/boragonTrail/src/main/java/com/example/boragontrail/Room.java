package com.example.boragontrail;


import java.util.Random;

class Room {                 //outer

private int rowIndex, colIndex, totalLoot;
private NPC npc;
private boolean blocked;
private boolean enemy;

        public Room(int rowIndex, int colIndex) {
            this.rowIndex = rowIndex;
            this.colIndex = colIndex;
            this.totalLoot = 120;
            int chance = rollDice(2);
            if (chance == 1) {
                npc = new NPC();
                this.enemy = true;
            }
            else {
                npc = null;
                this.enemy = false;
            }
        }


        public int getRowIndex() {
            return rowIndex;
        }

        public void setRowIndex(int rowIndex) {
            this.rowIndex = rowIndex;
        }

        public int getColIndex() {
            return colIndex;
        }

        public void setColIndex(int colIndex) {
            this.colIndex = colIndex;
        }

        public int getTotalLoot() {
            return totalLoot;
        }

        public void setTotalLoot(int totalLoot) {
            this.totalLoot = totalLoot;
        }

        public NPC getNpc() {
            return npc;
        }

        public void setNpc(NPC npc) {
            this.npc = npc;
        }

        public boolean isBlocked() {
            return blocked;
        }

        public void setBlocked(boolean blocked) {
            this.blocked = blocked;
        }

        public boolean isEnemy() {
            return enemy;
        }

        public void setEnemy(boolean enemy) {
            this.enemy = enemy;
        }
    public int rollDice(int side){
        Random random = new Random();
        return random.nextInt(side);

    }

    }
























