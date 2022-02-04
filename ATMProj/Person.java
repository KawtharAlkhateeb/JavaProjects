package assignments.A00;
public class Person {
    private String name; 
    public Person(){
        name = " "; // set the name to empty 
    }
    public String getName(){
        return name; 
    }
    public void setName(String nameString){
        name = nameString; 
        System.out.println("The name is set to " + nameString); 
    }
}
