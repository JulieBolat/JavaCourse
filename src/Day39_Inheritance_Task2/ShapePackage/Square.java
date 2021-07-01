package Day39_Inheritance_Task2.ShapePackage;

public class Square extends Rectangle{

    /**

     -Overriding happens in multiple class
     -To achieve overriding classes should have parent-child relationship
     -Method name and Method parameters should be same with super method

     */

    @Override
    public void calculateArea(int length, int width){
        super.area = length * length;
    }

    @Override
    public void calculatePerimeter(int length, int width){
        super.perimeter = 4 * length;
    }

}