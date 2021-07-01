package Day32_ConstructorTask_May28;

public class BankAccount {

    //May 28th, Lesson 2

    /*
    Every class has a constructor even we did not create any (default constructor)
    Constructor will always have the same name with class

                            Method VS Constructor
                 -Constructor will have the same name with classname
                 -Method can have any name

                 -Constructor must not have a return type
                 -Method must have a return type even it's void

                 -Constructor will be created automatically by Java (default constructor)
                 -Method will not be created automatically

                 -We use Constructor to initialize instances of an object
                 -We use Method to perform action (it's a function)
     */

        String customerName;
        int ssn;
        String city;
        double customerBalance;
        static double banksBalance;

        // NoArgs Constructor
        public BankAccount(){
            this.customerName = "Not initialized";
            this.ssn = 0;
        }

        // Parametrized Constructor
        public BankAccount(String customerName, int ssn){
            this.customerName = customerName;
            this.ssn = ssn;
        }

        // Constructor Overloading
        public BankAccount(String customerName, int ssn, String city){
            this.customerName = customerName;
            this.ssn = ssn;
            this.city = city;
        }


        public void deposit(double moneyToDeposit){
            customerBalance += moneyToDeposit;
            banksBalance += moneyToDeposit;
        }

        public void withdraw(double moneyToWithdraw){
            customerBalance -= moneyToWithdraw;
            banksBalance -= moneyToWithdraw;
        }


}
