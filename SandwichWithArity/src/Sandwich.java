import java.util.Scanner;

public class Sandwich {
    private String breadType;
    private double baseCost, costPerItem;
    private String[] items;

    public Sandwich(String breadType, double baseCost, double costPerItem, String... inputItems){
        this.breadType = breadType;
        this.baseCost = baseCost;
        this.costPerItem = costPerItem;
        this.items = new String[] {};
        this.addItems(inputItems);
    }

    public double getTotalCost(){
        return items.length*costPerItem+baseCost;
    }

    public void addItemsConsole(){
        Scanner keyboard = new Scanner(System.in);
        String temp;
        System.out.print("Please enter new ingredients!\n");
        temp = keyboard.nextLine();
        String[] ingredients = temp.split(",");
        for (int i = 0; i < ingredients.length; i++){
            ingredients[i] = ingredients[i].trim();
        }
        this.addItems(ingredients);//doesn't stop empty items but it's good enough.
    }

    public void addItems(String... newItems){
        String[] temp = items;//copy over the memory location? think that's how it works.
        items = new String[temp.length + newItems.length];
        System.arraycopy(temp, 0, items, 0, temp.length);
        System.arraycopy(newItems, 0, items, temp.length, newItems.length);
    }

    public String getItems(){
        String temp = "";
        for(int i = 0; i < items.length; i++) {
            temp += items[i] + ", ";
        }
        return temp;
    }

    public String getBreadType () {
        return breadType;
    }

    public double getBaseCost () {
        return baseCost;
    }

    public double getCostPerItem () {
        return costPerItem;
    }
}
