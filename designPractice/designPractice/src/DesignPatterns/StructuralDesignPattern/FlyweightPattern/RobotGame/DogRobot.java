package DesignPatterns.StructuralDesignPattern.FlyweightPattern.RobotGame;

public class DogRobot implements RobotFlyweight{
    private String robotType;
    private String robotColor;
    private String robotHeight;
    private String robotWeight;

    public DogRobot(String robotType, String robotColor, String robotHeight, String robotWeight) {
        this.robotType = robotType;
        this.robotColor = robotColor;
        this.robotHeight = robotHeight;
        this.robotWeight = robotWeight;
    }

    public void display() {
        System.out.println("Dog Robot: " + robotType + ", Color: " + robotColor + ", Height: " + robotHeight + ", Weight: " + robotWeight);
    }
}
