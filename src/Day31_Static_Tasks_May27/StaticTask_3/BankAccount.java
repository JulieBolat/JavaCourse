package Day31_Static_Tasks_May27.StaticTask_3;

public class BankAccount {

    String customerName;
    double customerBalance;

    public void deposit(double moneyToDeposit){
        customerBalance += moneyToDeposit;
    }

    public void withdraw(double moneyToWithdraw){
        customerBalance -= moneyToWithdraw;
    }

}

