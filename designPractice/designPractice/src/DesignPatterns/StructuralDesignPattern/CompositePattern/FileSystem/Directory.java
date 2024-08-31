package DesignPatterns.StructuralDesignPattern.CompositePattern.FileSystem;

import java.util.*;

public class Directory implements FileSystem{
    List<FileSystem> fileSystemList = new ArrayList<>();
    String name;

    public Directory(String name){
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println(name+"/");
        for(FileSystem fileSystem : fileSystemList){
            fileSystem.ls();
        }
    }

    @Override
    public void addFile(FileSystem fileSystem) {
        fileSystemList.add(fileSystem);
    }

    @Override
    public void removeFile(FileSystem fileSystem) {
        fileSystemList.remove(fileSystem);
    }


}
