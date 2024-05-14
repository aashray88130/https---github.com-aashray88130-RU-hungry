package restaurant;

/**
 * This file is the "node" in the Transaction linked list
 * 
 * @author Mary Buist
 * @author Kushi Sharma
*/

public class TransactionNode{
    private TransactionData data; // data portion of node
    private TransactionNode next; // link to next node in the list

    /*
     * Default constructor
     */
    public TransactionNode (){
        data = null;
        next = null;
    }

    /*
     * Constructor
     * @param data object holding information about a transaction
     * @param next link to the next node in the list
     */
    public TransactionNode(TransactionData data, TransactionNode next){
        this.data = data;
        this.next = next;
    }

    // "To Get" and "To Set" Methods
    public TransactionData getData() { return data;}
    public TransactionNode getNext() { return next;}

    public void setData(TransactionData dataInput) {data = dataInput;}
    public void setNext(TransactionNode nextInput) {next = nextInput;}
}