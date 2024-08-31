package DesignPatterns.StructuralDesignPattern.FlyweightPattern.RobotGame;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    private static Map<String, RobotFlyweight> robotMap = new HashMap<>();

    public static RobotFlyweight createRobot(String robotType) {
        if(robotMap.containsKey(robotType)) {
            return robotMap.get(robotType);
        } else {
            RobotFlyweight robot = null;
            if(robotType.equals("Dog")) {
                robot = new DogRobot("Dog", "Black", "10", "20");
            } else if(robotType.equals("Humanoid")) {
                robot = new HumanoidRobot("Humanoid", "White", "20", "30");
            }
            robotMap.put(robotType, robot);
            return robot;
        }
    }
}
