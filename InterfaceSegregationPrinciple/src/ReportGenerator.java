/**
 * Created by themzdht on 29.04.2017.
 */
public class ReportGenerator {

    private Reporting transactionObject;

    public void generateReport() {
        System.out.println(transactionObject.getDate() + "" + transactionObject.getDate() + transactionObject.productBreakDown());
    }
}
