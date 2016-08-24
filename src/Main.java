/**
 * Created by adaml on 24.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        BankAcc account = new BankAcc();

        account.setAccNumber(123456);
        account.setBalance(0);
        account.setCustomerEmail("client@bank.com");
        account.setCustomerName("John Doe");
        account.setCustomerPhone(1231212);

        System.out.println("This is account number "
                +account.getAccNumber()
                +" which owner is "
                +account.getCustomerName()
                +" and his email is "
                +account.getCustomerEmail()
                +" and his phone is "
                +account.getCustomerPhone());
        System.out.println("Balance of the account is "
                +account.getBalance()+"$");

        //Rise balance to 10 000$
        account.addFunds(10000);
        System.out.println("Balance of the account is "
                +account.getBalance()+"$");

        //Withdrawn 10 001$
        account.withdrawFunds(10001);
        System.out.println("Balance of the account is "
                +account.getBalance()+"$");

        //Withdrawn 1$
        account.withdrawFunds(1);
        System.out.println("Balance of the account is "
                +account.getBalance()+"$");
    }
}
