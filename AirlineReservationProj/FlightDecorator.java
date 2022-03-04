// the abstract class is part of the decorator pattern 

public abstract class FlightDecorator implements Flight {

    protected Flight tempFlight; 
    public FlightDecorator(Flight tempFlight){
        this.tempFlight = tempFlight; 
    }
    @Override
    public int getPrice(){
        return tempFlight.getPrice(); 
    }
}
