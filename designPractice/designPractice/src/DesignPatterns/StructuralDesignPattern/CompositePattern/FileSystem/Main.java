package DesignPatterns.StructuralDesignPattern.CompositePattern.FileSystem;

import DesignPatterns.StructuralDesignPattern.CompositePattern.FileSystem.Directory;
import DesignPatterns.StructuralDesignPattern.CompositePattern.FileSystem.File;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory user = new Directory("user");
        File a = new File("a.java");

        root.addFile(home);
        home.addFile(user);
        user.addFile(a);

        root.ls();
        System.out.println("-----");
        user.removeFile(a);
        root.ls();

        System.out.println("-----");
        File b = new File("b.txt");
        user.addFile(b);
        root.ls();

        System.out.println("-----");
        root.removeFile(home);
        root.ls();

    }
}
