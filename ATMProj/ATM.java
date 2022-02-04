package assignments.A00;
/**
 * name: Kawthar Alkhateeb (200434321)
 * Date: Jan 30th, 2022
 * Describtion: 
 *      
 */
public class ATM{
    private int cash; 
    private boolean inService;
    CashDispenser dispenser= new CashDispenser(); 
    ReceiptPrinter printer = new ReceiptPrinter(); 
    CardReader reader = new CardReader(); 
    KeypadDisplay display = new KeypadDisplay();  
    public ATM (){
        cash =0; 
        inService= false; 
    }
    public ATM(int cash, boolean service){
        this.cash= cash; 
        this.inService= service; 
    }
    public int queryCash(){
        return cash; 
    }
    public void increaseCash(int amount){
        cash += amount; 
    }
    public void reduceCash(int amount){
        cash -= amount;  
    }
    public boolean getServiceStatus(){
        return inService; 
    }
    public void changeServiceStatus(){
        inService = ! inService; 
        System.out.println("The current service status is: " + inService); 

    }
    class CashDispenser{
        public void dispenseCash(int cash){
            reduceCash(cash);
            System.out.println(cash + " dollars has been dispensed. "); 
        }
    }
    class ReceiptPrinter{
        public void printReceipt(){
            System.out.println("Receipt has been printed"); 
        }
    }
    class CardReader{
        public void readCard(){
            System.out.println("Card has been read"); 
        }
    }
    class KeypadDisplay{
        public void displayPINverification (){
            System.out.println("PIN has been verified"); 
        }
    }
}


