package Day44_Exceptions.ThrowsException;

import java.io.IOException;

public class Account {

    public void deposit(double moneyToDeposit) throws IOException{
        if (moneyToDeposit <= 0)
            throw new IOException();
    }

}
