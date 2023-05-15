import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;
public class Main {
    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();
        bankApplication.processCheck("accountId000", 50, "USD");
        bankApplication.processCheck("accountId003", 250, "HRV");
        bankApplication.processCheck("accountId001", 50, "EUR");
        bankApplication.processCheck("accountId001", 50, "USD");
     }
}


