package Day41_Abstract.Task2;

public abstract class Sweet extends Food{

    public abstract void madeIn();

    @Override
    public void taste() {
        System.out.println("Sweet, sugary");
    }
}