package Day41_Abstract.Task2;

public abstract class Salad extends Food{

    public abstract void madeIn();

    @Override
    public void taste() {
        System.out.println("Salty, sour");
    }
}