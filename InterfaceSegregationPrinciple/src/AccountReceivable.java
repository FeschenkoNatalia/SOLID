/**
 * Created by themzdht on 29.04.2017.
 */
public class AccountReceivable {

    private CustomerTransaction transactionObject;

    public AccountReceivable(CustomerTransaction aTransaction) {
        this.transactionObject = aTransaction;
    }

    public void postPayment(){
        transactionObject.chargeCustomer();
    }

    public void sendInvoice(){
        transactionObject.prepareInvoice();
        // sends the invoice
    }
}
