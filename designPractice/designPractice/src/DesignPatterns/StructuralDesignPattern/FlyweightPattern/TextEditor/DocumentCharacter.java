package DesignPatterns.StructuralDesignPattern.FlyweightPattern.TextEditor;

public class DocumentCharacter implements Letter{
    private char character;
    private String font;
    private int size;

    public DocumentCharacter(char character, String font, int size) {
        this.character = character;
        this.font = font;
        this.size = size;
    }

    @Override
    public void display(int row, int column) {
        System.out.println("Character: " + character + ", Font: " + font + ", Size: " + size + ", Row: " + row + ", Column: " + column);
    }
}
