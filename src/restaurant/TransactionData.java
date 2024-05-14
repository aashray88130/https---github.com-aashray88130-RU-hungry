package restaurant;

/**
 * This file is the data portion of the TransactionNode.
 * 
 * @author Mary Buist
 * @author Kushi Sharma
*/

public class TransactionData {
    
    private  String type;    // one of three: order, donation, restock
    private  String item;    // either food order or ingredient donation request/ restock
    private     int amount;  // quantity of food being purchased/donated/restocked
    private  double profit;  // profit? (+/-)
    private boolean success; // true if successfull transaction, false otherwise 

    /*
     * Default constructor
     */
    public TransactionData (){
        type = null;
        item = null;
        amount = 0;
        profit = 0;
        success = false;
    }
    
    /*
     * Constructor
     * @param type one of three: order, donation, restock
     * @param item 
     * @param amount quantity of food being purchased/donated/restocked
     * @param profit positive amount for orders, negative amount for donation and restocks
     * @param success true if successfull transaction, false otherwise 
     */
    public TransactionData(String type, String item, int amount, double profit, boolean success){
        this.type = type;
        this.item = item;
        this.amount = amount;
        this.profit = profit;
        this.success = success;
    }

    // Getter and Setter Methods
    public String getType() { return type;}
    public String getItem() { return item;}
    public int getAmount() { return amount;}
    public Double getProfit() { return profit;}
    public boolean getSuccess() { return success;}

    public void setType(String type) {this.type = type;}
    public void setItem(String item) {this.item = item;}
    public void setAmount(int amount) {this.amount = amount;}
    public void setProfit(double profit) {this.profit = profit;}
    public void setSuccess(boolean success) {this.success = success;}
}
