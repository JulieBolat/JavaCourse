package Day45_StringBuffer.ExceptionTasks.TASK1;

public class Car {

    public void buy(CarCondition carCondition) throws Exception{
        if (carCondition == CarCondition.OLD)
            throw new Exception("This car is too old!");
        if (carCondition == CarCondition.WASTE)
            throw new Exception("This car is waste!");
    }

    public void drive(String weather){
        if (!weather.equalsIgnoreCase("normal"))
            throw new RuntimeException("The weather is not good to drive!");
    }

}
