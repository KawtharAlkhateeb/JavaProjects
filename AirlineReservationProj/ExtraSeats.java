// The class is part of the decorator pattern as an extra functionality. 
public class ExtraSeats extends FlightDecorator {
    public ExtraSeats (Flight newFlight){
        super(newFlight); 
    }
    public int getPrice(){
        return tempFlight.getPrice() + 10; 
    }
    
}
