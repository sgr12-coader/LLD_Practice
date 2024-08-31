package DesignPatterns.StructuralDesignPattern.CompositePattern.FileSystem;

public class File implements FileSystem{
    String name;

    public File(String name){
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println(name);
    }

    @Override
    public void addFile(FileSystem fileSystem) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeFile(FileSystem fileSystem) {
        throw new UnsupportedOperationException();
    }
}
