package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by themzdht on 29.04.2017.
 */
public class DatabaseConnectionManager {
    private Connection conn;

    private static DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();

    protected DatabaseConnectionManager(){

    }

    public static DatabaseConnectionManager getManagerInstance(){
        return connectionManager;
    }

    /**
     * contains connection detail
     *
     * @throws java.sql.SQLException
     */
    public void connect() throws SQLException{
        // processing specific to database connection details...
        conn = DriverManager.getConnection("Some/Database/URL");
        System.out.println("Establishing Database Connection...");
    }

    public Connection getConnectionObject() {
        return conn;
    }

    public void disconnect() throws SQLException {
        conn.close();
    }


}
