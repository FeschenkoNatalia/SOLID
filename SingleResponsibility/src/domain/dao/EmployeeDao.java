package domain.dao;

import domain.Employee;

/**
 * Created by themzdht on 28.04.2017.
 */
public class EmployeeDao{
    public void saveEmployee(Employee employee) {
//        DatabaseConnectionManager databaseConnectionManager = DatabaseConnectionManager.getManagerInstance();
//        databaseConnectionManager.connect();
//        databaseConnectionManager.getConnectionObject().prepareStatement("insert into employee table");
//        databaseConnectionManager.disconnect();
        System.out.println("saved employee to the database: "+employee);
    }

    public void deleteEmployee(Employee employee) {
        System.out.println("deleted employee from the database: "+employee);
    }
}
