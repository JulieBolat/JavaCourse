package Day36_Encapsulation_Jun7;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
//        employee.baseSalary; not accessible because it's private
        employee.setBaseSalary(90_000);
        int baseSalary = employee.getBaseSalary();
        employee.hourlyRate = 45;

        int wage = employee.calculateWage(10);
        System.out.println(baseSalary);
        System.out.println(wage);
    }

}