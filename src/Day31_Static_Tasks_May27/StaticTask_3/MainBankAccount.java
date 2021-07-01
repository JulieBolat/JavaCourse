package Day31_Static_Tasks_May27.StaticTask_3;

public class MainBankAccount {

        public static void main(String[] args) {

            BankAccount customer1 = new BankAccount();
            customer1.customerName = "Kemal";
            customer1.customerBalance = 10000;

            System.out.println("Customer Balance: " + customer1.customerBalance);
            customer1.deposit(300);
            System.out.println("Customer balance after deposit: " + customer1.customerBalance);
            customer1.withdraw(4755);
            System.out.println("Customer balance after withdraw: " + customer1.customerBalance);


            BankAccount customer2 = new BankAccount();
            customer2.customerName = "Hafid";
            customer2.customerBalance = 1000000;

            System.out.println("Customer2 Balance: " + customer2.customerBalance);
            customer2.deposit(7644);
            System.out.println("Customer2 balance after deposit: " + customer2.customerBalance);
            customer2.withdraw(98321);
            System.out.println("Customer2 balance after withdraw: " + customer2.customerBalance);

        }

    }

