package restaurant;

/**
 * This file is the data portion of the MenuNode.
 * 
 * @author Kushi Sharma
 * @author Mary Buist
*/

public class Dish {
    private String category; // name of the category
    private String name;     // name of the dish
    private int[] stockID;   // 1-D int array where each index is the ID of the ingredient needed for the dish
    private double price;    // price of the dish
    private double profit;   // profit made when selling a dish

    /*
     * Constructor
     * @param category name of the category this dish belongs to.
     * @param name regers to the name of the dish
     * @param stockID all ingredients' IDs needed for the dish
     */
    public Dish (String category, String name, int[] stockID) {
        this.category = category;
        this.name = name;
        this.stockID = stockID;
    }

    // Getter and Setter methods
    public String getCategory() { return category; }

    public String getName() { return name; }
    
    public int[] getStockID() { return stockID; }

    public double getPriceOfDish() { return price; }
    public void setPriceOfDish(double price) { this.price = price; }

    public double getProfit() { return profit; }
    public void setProfit(double profit) { this.profit = profit; }
}
