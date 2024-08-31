package DesignPatterns.CreationalDesignPattern.ObjectPoolDesignPattern;

import java.util.*;

public class DBConnectionPoolManager {
    private static final int MAX_POOL_SIZE = 10;
    private static final int INITIAL_POOL_SIZE = 5;
    private static DBConnectionPoolManager DBConnectionPoolInstance = null;
    private static final List<DBConnection> connectionPool = new ArrayList<>();
    private static final List<DBConnection> usedConnections = new ArrayList<>();

    private DBConnectionPoolManager() {
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            connectionPool.add(new DBConnection());
        }
    }

    public static DBConnectionPoolManager getInstance() {
        if(DBConnectionPoolInstance == null) {
            synchronized (DBConnectionPoolManager.class) {
                if(DBConnectionPoolInstance == null) {
                    DBConnectionPoolInstance = new DBConnectionPoolManager();
                }
            }
        }
        return DBConnectionPoolInstance;
    }

    public synchronized DBConnection getConnection() {
        if (connectionPool.isEmpty()) {
            if (usedConnections.size() < MAX_POOL_SIZE) {
                connectionPool.add(new DBConnection());
            } else {
                throw new RuntimeException("Maximum pool size reached, no available connections!");
            }
        }

        DBConnection connection = connectionPool.remove(connectionPool.size() - 1);
        usedConnections.add(connection);
        return connection;
    }

    public void releaseConnection(DBConnection connection) {
        if (connection == null) {
            return;
        }
        connectionPool.add(connection);
        usedConnections.remove(connection);
    }
}
