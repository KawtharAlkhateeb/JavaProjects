// This class is part of the decorator pattern 
public class InFlightMeals extends FlightDecorator {
    public InFlightMeals(Flight newFlight){
        super(newFlight); 
    }
    public int getPrice(){
        return tempFlight.getPrice() + 10; 
    }
    
}
