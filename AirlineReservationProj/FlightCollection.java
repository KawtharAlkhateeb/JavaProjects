// This class is part of the iterator pattern 
public class FlightCollection implements Collection {
    private FlightDatabase[] flightList;
    public FlightCollection( FlightDatabase[] newFlight){ 
        this.flightList = newFlight; 
    }
    public Iterator createIterator()
    {
        return new FlightIterator(flightList);
    }  
}
