package Day16_DoWhileLoops_Break_ForEachLoop;

public class _02_DoWhileLoop {

    public static void main(String[] args) {

        int count= 0;
        int count2=0;


        while (count2<10) {
            System.out.println("While" + " " + "TechnoStudy"+ count2);
            count2++;
        }
        do {
            System.out.println("Do While" + " " + "TechnoStudy" + count);
            count++;
        } while (count<10);
    }
}
