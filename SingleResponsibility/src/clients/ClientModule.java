package clients;

import domain.dao.EmployeeDao;
import domain.Employee;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

/**
 * Created by themzdht on 28.04.2017.
 */
public class ClientModule {

    public static void main(String[] args) {
        Employee peggy = new Employee(1, "peggy", "accounting", true);
        ClientModule.hireNewEmployee(peggy);
        ClientModule.printEmployeeReport(peggy, FormatType.CSV);
    }

    public static void hireNewEmployee(Employee employee){
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.saveEmployee(employee);
    }

    public static void terminatedEmployee(Employee employee){
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }
}
