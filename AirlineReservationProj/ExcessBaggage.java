// This class is part of the decorator pattern 
public class ExcessBaggage extends FlightDecorator {
    public ExcessBaggage(Flight newFlight){
        super(newFlight); 
    }
    public int getPrice(){
        return tempFlight.getPrice() + 20; 
    }
}
