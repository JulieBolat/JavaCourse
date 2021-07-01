package Day29_May24.HomeworkTask1;

public class MainElectricity {

    public static void main(String[] args) {

        Customer customer1= new Customer();
        customer1.name= "John";
        customer1.electricityAccount.totalWph= 100;
        System.out.println(customer1.electricityAccount.totalWph);

        System.out.println(customer1.name);
        System.out.println(customer1.electricityAccount);
        System.out.println(customer1.electricityAccount.rate);

        //System.out.println(Customer);

        //Customer customer2= createCustomer("Mike");
       // System.out.println(customerMike.name);

    }

    public static Customer createCustomer() {
        Customer customer = new Customer();
      //  customer.name= name;
        customer.electricityAccount= new ElectricityAccount();
        return customer;
    }
}
