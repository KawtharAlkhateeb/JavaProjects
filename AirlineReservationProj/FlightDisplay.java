// This class is the view in the MVC pattern I am using in this program
public class FlightDisplay {
    public void flightDisplay(FlightDatabase flightDb){
         
        if(flightDb ==null){
            System.out.println("Sorry, no matches found"); 
        }
        else{
            System.out.println("Matches found: "); 
            System.out.println(flightDb.getDepartCity() + " " + flightDb.getArrivCity() + " " + flightDb.getDepartTime() + "H $" + flightDb.getPrice());
        }
        // else{ 
        //     System.out.println("Found matches: "); 
        //     for(int i=0; i<flightDb.length; i++){
        //        System.out.println( "("+flightDb.length+")" + (flightDb[i].getDepartCity()) + " " + flightDb[i].getArrivCity() + " " + flightDb[i].getDepartTime() + "H $" + flightDb[i].getPrice()); 
        //     } 
        // }
         
    }  
}
