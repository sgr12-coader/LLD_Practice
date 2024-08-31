package DesignPatterns.CreationalDesignPattern.SingletonPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        DBConncetion dbConncetion1 = DBConncetion.getInstance();
        DBConncetion dbConncetion2 = DBConncetion.getInstance();
        System.out.println(dbConncetion1 == dbConncetion2); // true

//        check with thread
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            executor.execute(() -> {
                DBConncetion dbConncetion = DBConncetion.getInstance();
                System.out.println(dbConncetion == dbConncetion2); // true
            });
        }
        executor.shutdown();
    }
}
