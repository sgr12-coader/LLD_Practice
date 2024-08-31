package DesignPatterns.StructuralDesignPattern.FlyweightPattern.RobotGame;

public class Main {
    public static void main(String[] args) {
        RobotFlyweight dogRobot1 = RobotFactory.createRobot("Humanoid");
        dogRobot1.display();

        RobotFlyweight dogRobot2 = RobotFactory.createRobot("Dog");
        dogRobot2.display();
    }
}
