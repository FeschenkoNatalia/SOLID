import java.util.Date;
import java.util.List;

/**
 * Created by themzdht on 29.04.2017.
 */
public class CustomerTransaction implements Accounting, Reporting {

    private List<Product> products;
    private Customer customer;

    public CustomerTransaction(Customer customer, List<Product> products){
        this.products = products;
        this.customer = customer;
    }

    // methods for reporting
    @Override
    public String getName(){
        return customer.getName();
    }

    @Override
    public Date getDate(){
        return new Date();
    }

    @Override
    public String productBreakDown(){
        String reportList = null;
        for (Product product : products){
            reportList += product.getProductName();
        }
        return reportList;
    }

    @Override
    public void prepareInvoice(){
        System.out.println("invoice prepared...");
    }

    @Override
    public void chargeCustomer(){
        System.out.println("charged the customer");
    }
}
