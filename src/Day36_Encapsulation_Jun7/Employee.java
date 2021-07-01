package Day36_Encapsulation_Jun7;

public class Employee {

    //June 7th, Lesson 2

    private int baseSalary;
    public int hourlyRate;

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0){
            throw new IllegalArgumentException("Base salary cannot be equal or less than 0");
        }
        this.baseSalary = baseSalary;
    }

}