package assignments.A01;

public class AssemblyRobot extends RobotFactory implements Robot{
    static AssemblyRobot assemblyRobotInstance = new AssemblyRobot(); 
   
    
    private AssemblyRobot() {
    }
    public static AssemblyRobot getInstance(){
        return assemblyRobotInstance; 

    }
    @Override
    public void fetchParts() {
        System.out.println("Drilled parts are fetched"); 
        
    }
    @Override
    public void storeParts() {
        System.out.println("Assembled product is sent for storage. "); 
        
    }
    @Override
    public void doTask() {
        System.out.println("Assemble the product.");
        
    }
    
}
