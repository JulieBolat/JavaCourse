package Day44_Exceptions.ThrowExceptions;

public class Account {

    double balance;

    public void deposit(double moneyToDeposit){
        if (moneyToDeposit <= 0)
            throw new IllegalArgumentException();
        balance += moneyToDeposit;
    }

}
