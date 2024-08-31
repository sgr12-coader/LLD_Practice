package DesignPatterns.StructuralDesignPattern.CompositePattern.FileSystem;

public interface FileSystem {
    void ls();
    void addFile(FileSystem fileSystem);
    void removeFile(FileSystem fileSystem);
}
