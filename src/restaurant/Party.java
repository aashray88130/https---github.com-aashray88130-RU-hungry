package restaurant;

/**
 * PICK UP LINE (FOR FUN):
 * *people aren’t objects, but if I wrap myself around you, 
 * it gives me a method to my madness*
 * 
 * ***********
 * This file contains a party's information which is inputed into a queue.
 * 
 * @author Mary Buist
 * @author Kushi Sharma
*/

public class Party {

    private String name;           // The last name of the party
    private int    numberOfPeople; // The number of people in the party
    private int    tableIndex;     // Index in the RUHungy.tables array. Refers to 
                                   // the index of the table the party is sitting at.

    /*
     * Constructor
     * @param name the last name of the party
     * @param numberOfPeople the number of people in the party
     * @param tabelIndex the index of the table the party is sitting at
     */
    public Party (int numberOfPeople, String name, int tableIndex) {
        this.name = name;
        this.numberOfPeople = numberOfPeople;
        this.tableIndex = tableIndex;
    }

    // Getter and Setter methods
    public int getNumberOfPeople(){ return numberOfPeople;}

    public String getName() { return name; }

    public void setNumberOfPeople(int numberOfPeople) {this.numberOfPeople = numberOfPeople;}

    public void setName (String name){ this.name = name; }

    public int getTableIndex(){ return tableIndex; }

    public void setTableIndex(int tableIndex){ this.tableIndex = tableIndex;}

}