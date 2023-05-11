import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;
public class Main {
    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();
        try {
            bankApplication.process("accountId000", 50, "USD");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("The account does not have enough funds");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("Such an account does not exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("The account is in a different currency");
        } catch (Exception e) {
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thank you for using our service");
        }

        try {
            bankApplication.process("accountId003", 250, "HRV");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("The account does not have enough funds");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("Such an account does not exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("The account is in a different currency");
        } catch (Exception e) {
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thank you for using our service");
        }

        try {
            bankApplication.process("accountId001", 50, "EUR");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("The account does not have enough funds");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("Such an account does not exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("The account is in a different currency");
        } catch (Exception e) {
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thank you for using our service");
        }

        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("The account does not have enough funds");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("Such an account does not exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("The account is in a different currency");
        } catch (Exception e) {
            System.out.println("A processing error occurred, please try again");
        } finally {
            System.out.println("Thank you for using our service");
        }
    }
}

