package Day29_May24.HomeworkTask1;

public class Customer {

    String name;
    ElectricityAccount electricityAccount;

    public void consumeElectricity (int wph) {
        electricityAccount.totalWph +=wph;

    }
}
