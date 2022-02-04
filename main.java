package assignments.A00;
// hello 
 import java.util.*;
 public class main {
    
    public static void main (String args[]){
        Scanner input= new Scanner(System.in); 
        // a & b
        System.out.println("Please enter a number between 0 and 10000"); 
        int userInput = input.nextInt();
        //System.out.println(userInput);  
        ATM atm1 = new ATM(); 
        ATM atm2 = new ATM(userInput, true); 
        // System.out.println(atm1.queryCash()); 
        // System.out.println(atm2.queryCash()); 
        // System.out.println(atm2.getServiceStatus());
        // c  
        Operator operator= new Operator(); 
        System.out.println("Please enter operator's name: "); 
        String operatorName = input.next(); 
        operator.setName(operatorName);
        System.out.println("Processing ATM 1");
        operator.topUpATM(atm1);
        System.out.println("Processing ATM 2");
        operator.topUpATM(atm2);
        // d
        Customer customer = new Customer(); 
        System.out.println("Please enter customer's name: ");
        String customerName = input.next(); 
        customer.setName(customerName);
        System.out.println("Amount to withdraw: ");
        int withdrawAmount = input.nextInt(); 
        
        customer.withdrawCash(atm1, withdrawAmount);

    }
    
}
