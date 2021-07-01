package Day40_Polymorphism.Polymorphism.Homework;

public class PrivilegedAccount extends BankAccount{

    boolean isOverDrafted = false;

    public PrivilegedAccount(String userID){
        super(userID);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Not Valid!");
        double newBalance = getBalance() - amount;
        if (newBalance < 0){
            isOverDrafted = true;
        }
        setBalance(newBalance);
    }
}