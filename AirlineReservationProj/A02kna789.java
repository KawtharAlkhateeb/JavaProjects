/**
    Name: Kawthar Alkhateeb 
    SID: 200434321
    Description: This is a demo of the flight reservation program. 
 */
public class A02kna789 {
    public static void main(String args[]){ 
        FlightDatabase array[] = new FlightDatabase [3]; 
        array[0] = new FlightDatabase("Regina", "Vancouver", 900, 300); 
        array[1] = new FlightDatabase("Regina", "Vancouver", 1500, 350);
        array[2] = new FlightDatabase("Regina", "Toronto", 1300, 500);
        FlightDatabase model = new FlightDatabase(); 
        FlightDisplay view = new FlightDisplay();  
        FlightController flight1= new FlightController(model, view); 
        flight1.readUserInput(array); 
    }
    
}
