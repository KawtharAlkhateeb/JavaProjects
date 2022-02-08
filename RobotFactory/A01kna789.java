package assignments.A01;

public class A01kna789 {
    public static void main(String args[]){
        RobotFactory cuttingRobot1= new RobotFactory("Cutting", "Regina Machines", 000111222333);
        RobotFactory cuttingRobot2= new RobotFactory("Cutting", "Regina Machines", 000323450011); 
        RobotFactory drillingRobot1= new RobotFactory("Drilling", "Regina Machines", 000043221177);
        RobotFactory drillingRobot2= new RobotFactory("Drilling", "Regina Machines", 000066222211);
        RobotFactory assemblygRobot= new RobotFactory("Assembly", "SK Robotics", 000323451100);
        // printing the info of the created robots 
        cuttingRobot1.printInfo(); 
        cuttingRobot2.printInfo();
        drillingRobot1.printInfo();
        drillingRobot2.printInfo();
        assemblygRobot.printInfo();
        // creating and calling the cutting robots (robotController is calling)
        Robot cuttingRobot= cuttingRobot1.createRobot("cutting");
        Robot cutRobot= cuttingRobot2.createRobot("CUTTING");
        // the loop is needed because we need at least 4 part to be cut and then drilled 
        // so that the assmblty robot can assemble a product.  
        for(int i=0; i<2; i++){
            cuttingRobot.fetchParts();
            cutRobot.fetchParts();
            cuttingRobot.doTask();
            cutRobot.doTask();
            cuttingRobot.storeParts(); 
            cutRobot.storeParts();
        }
        // robotController creating the drilling robots 
        Robot drillRobot= drillingRobot1.createRobot("DRILLING");
        Robot drilRobot2= drillingRobot2.createRobot("DRILLING"); 
        for(int i=0; i<2; i++){
            drillRobot.fetchParts();
            drilRobot2.fetchParts();
            drillRobot.doTask();
            drilRobot2.doTask();
            drillRobot.storeParts(); 
            drilRobot2.storeParts();
        }
        // robotController creating the assembly robot 
        Robot assemRobot = assemblygRobot.createRobot("ASSEMBLY"); 
        assemRobot.fetchParts();
        assemRobot.doTask();
        assemRobot.storeParts();

    }
    
}
