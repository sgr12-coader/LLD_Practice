package DesignPatterns.StructuralDesignPattern.FlyweightPattern.TextEditor;

public class Main {
    public static void main(String[] args) {
        Letter letter1 = LatterFactory.createLetter('a');
        letter1.display(1, 1);

        Letter letter2 = LatterFactory.createLetter('b');
        letter2.display(2, 2);

        Letter letter3 = LatterFactory.createLetter('a');
        letter3.display(3, 3);
    }
}
