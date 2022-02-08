package assignments.A01;

public class DrillingRobot extends RobotFactory implements Robot {
    // public DrillingRobot(String robotType, String factory, int serialNo){
    //     this.type = robotType; 
    //     this.manufactorurer = factory; 
    //     this.serialNum = serialNo; 
    // }
    // @Override
    // public void printInfo(){
    //     // to print the info a the robot
    //     System.out.println(type + " robot created");
    //     System.out.println(manufactorurer +" "+ serialNum);
    // }
    public DrillingRobot() {
    }
    @Override
    public void fetchParts() {
        System.out.println("Cut material fetched.");
    }
    @Override
    public void storeParts() {
        System.out.println("Drilled parts sent for storage."); 
        
    }
    @Override
    public void doTask() {
        System.out.println("Holes are drilled. "); 
        
    }
    
}
