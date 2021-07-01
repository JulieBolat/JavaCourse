package Day29_May24.HomeworkTask1;

public class ElectricityAccount {

    int totalWph;
    double rate= 0.7;
    double bill;

    public double calculateBill() {
        bill = rate * totalWph;
        return bill;

    }

}
