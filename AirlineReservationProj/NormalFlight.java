// This class is also part of the decorator pattern 

public class NormalFlight implements Flight {
    int price; 
    public NormalFlight (int price){
        this.price = price; 
    }
    @Override
    public int getPrice(){
        return this.price; 
    }
    
}
