package assignments.A01;

public class RobotFactory {
    private String type; 
    private String manufactorurer; 
    private int serialNum; 
    public RobotFactory(String robotType, String factory, int serialNo){
        this.type = robotType; 
        this.manufactorurer = factory; 
        this.serialNum = serialNo; 
    }
    public RobotFactory() {
    }
    public void printInfo(){
        // to print the info a the robot
        System.out.println(type + " robot created");
        System.out.println(manufactorurer +" "+ serialNum);
    }
    public Robot createRobot(String robotType){
        if(robotType == null || robotType.isEmpty()){
            return null; 
        }
        if("CUTTING".equalsIgnoreCase(robotType)){
            return new CuttingRobot(); 
        }
        if("ASSEMBLY".equals(robotType)){
            return AssemblyRobot.getInstance(); 
        }
        if("DRILLING".equals(robotType)){
            return new DrillingRobot(); 
        }

        return null; 
    } 
}
