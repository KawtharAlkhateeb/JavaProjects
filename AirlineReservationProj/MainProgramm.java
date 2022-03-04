
public class MainProgramm {
    public static void main (String args[]){
        // Flight flight = new NormalFlight(300); 
        // flight = new InFlightMeals(flight); 
        // flight = new ExcessBaggage(flight); 
        // flight = new ExtraSeats(flight); 
        // System.out.println(flight.getPrice() + "$ "); 
        FlightDatabase array[] = new FlightDatabase [3]; 
        array[0] = new FlightDatabase("Regina", "Vancouver", 900, 300); 
        array[1] = new FlightDatabase("Regina", "Vancouver", 1500, 350);
        array[2] = new FlightDatabase("Regina", "Toronto", 1300, 500);
        FlightDatabase model = new FlightDatabase(); 
        FlightDisplay view = new FlightDisplay();  
        FlightController flight1= new FlightController(model, view); 
        //System.out.println(array[0].getDepartCity()); 
        flight1.readUserInput(array); 
    }
}
