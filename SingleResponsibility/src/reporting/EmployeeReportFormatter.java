package reporting;

import domain.Employee;

/**
 * Created by themzdht on 28.04.2017.
 */
public class EmployeeReportFormatter extends ReporterFormatter {

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
        //TODO
    }

    public String getFormattedEmployee() {
        return getFormattedValue();
    }
}
