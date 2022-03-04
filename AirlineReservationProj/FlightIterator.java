// This class is part of the iterator pattern. 
public class FlightIterator implements Iterator {
    FlightDatabase [] flightsList; 
    // maintains curr pos of iterator over the array
    int pos = 0;
    public FlightIterator (FlightDatabase[] list){
        this.flightsList = list; 
    }
    @Override
    public Object next(){
        FlightDatabase flight = flightsList[pos]; 
        pos +=1; 
        return flight; 
    }
    @Override
    public boolean hasNext(){
        if(pos >= flightsList.length || flightsList[pos] == null){
            return false; 
        }
        else 
            return true; 
    } 
}
