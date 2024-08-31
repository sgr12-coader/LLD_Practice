package DesignPatterns.CreationalDesignPattern.ObjectPoolDesignPattern;

public class Main {
    public static void main(String[] args) {
        DBConnectionPoolManager poolManager = DBConnectionPoolManager.getInstance();
        DBConnection connection = poolManager.getConnection();
        poolManager.releaseConnection(connection);
    }
}
