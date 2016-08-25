/**
 * Created by adaml on 25.08.2016.
 */
public class VipBankAcc {
    private String name;
    private String email;
    private double creditLimit;

    public VipBankAcc(){
        this("Default Name","Default email",1000.00);
    }

    public VipBankAcc(String name, String email) {
        this(name,email,1000.00);
    }

    public VipBankAcc(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }
}
