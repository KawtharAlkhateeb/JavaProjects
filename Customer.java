package assignments.A00;
public class Customer extends Person {
    public void withdrawCash(ATM atm, int amount){
        //System.out.println("The current status of the ATM is: "+atm.getServiceStatus()); 
        if(atm.getServiceStatus() == false){
            System.out.println("ATM is not in service"); 
        }
        if(atm.queryCash() < amount){
            System.out.println("ATM has insufficient cash"); 
        }
        else{
            atm.reader.readCard();
            atm.display.displayPINverification();
            atm.dispenser.dispenseCash(amount);
            atm.printer.printReceipt();
            System.out.println(amount + " successfully withdrawn from ATM"); 
        }
    }
    
}
