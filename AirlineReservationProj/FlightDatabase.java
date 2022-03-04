// This class is the model in the MVC pattern I am using in this program

public class FlightDatabase {
    private String depatureCity; 
    private String arrivalCity; 
    private int departureTime; 
    private int price; 
    public FlightDatabase(){

    }
    public FlightDatabase(String city1, String city2, int time, int cost){
        this.depatureCity = city1; 
        this.arrivalCity = city2; 
        this.departureTime = time; 
        this.price= cost; 
    }
    public String getDepartCity(){
        return this.depatureCity; 
    }
    public String getArrivCity(){
        return this.arrivalCity; 
    }
    public int getDepartTime(){
        return this.departureTime; 
    }
    public int getPrice(){
        return this.price; 
    }
    public FlightDatabase retrieveFlightFromDatabase(String city1, String city2, FlightDatabase[] newFlight){
        FlightCollection flights = new FlightCollection(newFlight); 
        Iterator iterator = flights.createIterator();
        
        while(iterator.hasNext()){
            FlightDatabase db = (FlightDatabase)iterator.next();
            if((db.getDepartCity().equalsIgnoreCase(city1)) &&(db.getArrivCity().equalsIgnoreCase(city2))){
               return db; 
            }
        }
        return null; 
    }
}
