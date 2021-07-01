package Day32_ConstructorTask_May28;

public class MainAccount {

        public static void main(String[] args) {

            BankAccount customer = new BankAccount();

            System.out.println(customer.customerName);
            System.out.println(customer.ssn);

            BankAccount customer1 = new BankAccount("John", 123456789);

            customer1.deposit(10000);

            System.out.println(customer1.customerName);
            System.out.println(customer1.ssn);
            System.out.println(customer1.customerBalance);

            BankAccount customer2 = new BankAccount("Mark", 987654321, "Brooklyn");

            System.out.println(customer2.customerName);
            System.out.println(customer2.ssn);
            System.out.println(customer2.city);
        }

}
