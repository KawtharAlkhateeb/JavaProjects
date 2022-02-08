package assignments.A01;

public class CuttingRobot extends RobotFactory implements Robot{
    // private String type; 
    // private String manufactorurer; 
    // private int serialNum; 
    // public CuttingRobot(String robotType, String factory, int serialNo){
    //     this.type = robotType; 
    //     this.manufactorurer = factory; 
    //     this.serialNum = serialNo; 
    // }
    public CuttingRobot() {
    }
    
    // public void printInfo(){
    //     // to print the info a the robot
    //     System.out.println(type + " robot created");
    //     System.out.println(manufactorurer +" "+ serialNum);
    // }
    @Override
    public void fetchParts() {
        System.out.println("Raw material fetched"); 
        
    }
    @Override
    public void storeParts() {
        System.out.println("Cut part is stored.");
        
    }
    @Override
    public void doTask() {
        System.out.println("Raw material is cut. ");
    }
    
}
