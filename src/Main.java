import exceprions.WrongAccountException;
import exceprions.WrongCurrencyException;
import exceprions.WrongOperationException;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();

        try {
            bankApplication.process("accountId002", 50, "EUR");
//            bankApplication.process( "accountId003",  250, "HRV");
//            bankApplication.process( "accountId001",  50, "EUR");
//            bankApplication.process( "accountId001",  50, "USD");
//            bankApplication.process( "accountId001",  50, "USD");

        } catch (WrongAccountException wrongAccountException) {
            System.out.println("No such account exists");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("No money, honey");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("The account has another currency");
        } catch (Exception e) {
            System.out.println("A processing error occurred, please try again later");
        } finally {
            System.out.println("Thank you for using our service");
        }
    }
}