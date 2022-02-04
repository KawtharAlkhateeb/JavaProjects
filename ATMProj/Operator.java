package assignments.A00;
public class Operator extends Person {
    public void topUpATM(ATM atm){
        System.out.println("The current status of the ATM is: " + atm.getServiceStatus()); 
        System.out.println("The current amount of cash available in the ATM is: " + atm.queryCash()); 
        if(atm.getServiceStatus() == true){
            atm.changeServiceStatus();// turn it off 
        }
        if(atm.queryCash() < 5000){
            atm.increaseCash(5000);// add 5000 to the ATM machine
        }
        System.out.println("Now the current amount of cash in the ATM is: " + atm.queryCash()); 
        atm.changeServiceStatus();
        //System.out.println("Now, the current status of the ATM is: " + atm.getServiceStatus()); 
    }
    
}
