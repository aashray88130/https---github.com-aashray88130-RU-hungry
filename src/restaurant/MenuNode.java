package restaurant;


/**
 * This file is the "node" in the linked list at each index in the Menu "hashtable"
 * 
 * @author Kushi Sharma
 * @author Mary Buist
*/

public class MenuNode {
    private Dish dish;     // data portion of node
    private MenuNode next; // link to next node in the list

    /*
     * Constructor
     * @param dish the Dish
     * @param next link to the next node in the list
     */
    public MenuNode (Dish dish, MenuNode next) {
        this.dish = dish;
        this.next = next;
    }
    
    // Getter and Setter methods
    public Dish getDish() { return dish; }
    public void setDish(Dish dish) { this.dish = dish; }

    public MenuNode getNextMenuNode() { return next; }
    public void setNextMenuNode(MenuNode next) { this.next = next; }
    
}