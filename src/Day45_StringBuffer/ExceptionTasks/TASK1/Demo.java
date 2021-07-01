package Day45_StringBuffer.ExceptionTasks.TASK1;

public class Demo {

    public static void main(String[] args) {

        Car toyota = new Car();

        try { // buy method has checked exception | try-catch is required
            toyota.buy(CarCondition.NEW);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // drive method has runtime exception so try-catch is not required
        toyota.drive("Normal");

    }

}
