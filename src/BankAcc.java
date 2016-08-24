/**
 * Created by adaml on 24.08.2016.
 */
public class BankAcc {
    private int accNumber;
    private int balance;
    private String customerName;
    private String customerEmail;
    private int customerPhone;

    public int getAccNumber() {
        return this.accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhone() {
        return this.customerPhone;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }
    //Function allowing to add funds to the account
    public void addFunds(int val) {
        this.balance += val;
    }

    //Function allowing to withdraw funds from the account
    public void withdrawFunds(int val) {
        //Check if there is enough moneys on the account
        if (val>this.balance) {
            System.out.println("There is insufficient funds");
        } else {
            this.balance -= val;
        }
    }
}
