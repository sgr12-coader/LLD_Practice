package DesignPatterns.CreationalDesignPattern.SingletonPattern;

public class DBConncetion {
    private static DBConncetion dbConncetion;

    private DBConncetion() {
    }

    public static DBConncetion getInstance() {
        if (dbConncetion == null) {
            synchronized (DBConncetion.class) {
                if (dbConncetion == null) {
                    dbConncetion = new DBConncetion();
                }
            }
        }
        return dbConncetion;
    }

}
