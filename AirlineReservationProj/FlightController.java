// this class is the controller in the MVC pattern I am using for this class. 
import java.util.*;
public class FlightController {
    FlightDatabase model; 
    FlightDisplay view; 
    public FlightController (FlightDatabase db, FlightDisplay display){
        this.model = db; 
        this.view = display; 
    }
    public String getDepartureCity(){
       return model.getDepartCity(); 
    }
    public String getArrivalCity(){
       return model.getArrivCity(); 
    }
    public int getDepartureTime(){
       return model.getDepartTime(); 
    }
    public int getPrice(){
       return  model.getPrice(); 
    }

    public void readUserInput(FlightDatabase[] newFlight){
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter city of departure: ");
        String departCity = input.next(); 
        System.out.println("Please enter arrival city: ");
        String arriveCity= input.next(); 
        //System.out.println(departCity); 
        FlightDatabase data= model.retrieveFlightFromDatabase(departCity, arriveCity, newFlight);
        System.out.println(data.getDepartCity());
        view.flightDisplay(data); 
        Flight flight = new NormalFlight(data.getPrice());
        System.out.println("Do you want to add extra legroom seats (Y/N)?"); 
        char choice1= input.next().charAt(0); 
        if(Character.compare(choice1, 'Y')==0){
            flight = new ExtraSeats(flight);
            System.out.println(flight.getPrice() + "$ ");
        }
        
        System.out.println("Do you want to add in-flight meals (Y/N)?"); 
        char choice2= input.next().charAt(0); 
        if(Character.compare(choice2, 'Y')==0){
            flight = new InFlightMeals(flight); 
        }
        System.out.println("Do you want to add excess baggage (Y/N)"); 
        char choice3 = input.next().charAt(0); 
        if(Character.compare(choice3, 'Y')==0){
            flight = new ExcessBaggage(flight); 
        }
        System.out.println("Your final flight information is :"); 
        System.out.println("Departure city is :" + data.getDepartCity());
        System.out.println("Arrival city is :" + data.getArrivCity());
        System.out.println("Departure time is :" + data.getDepartTime() + "H ");
        System.out.println("Extra Legroom :" + choice1); 
        System.out.println("In-flight meals :" + choice2); 
        System.out.println("Excess Baggage :" + choice3); 
        System.out.println("Total price : $" + flight.getPrice()); 
    }
}
