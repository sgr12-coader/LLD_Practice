package DesignPatterns.StructuralDesignPattern.FlyweightPattern.TextEditor;
//Intrinsic values- character, font, size
//Extrinsic values- row, column


public interface Letter {
    void display(int row, int column);
}
